package com.nexola.apiportfolio.services;

import com.nexola.apiportfolio.dto.EmailDTO;
import com.nexola.apiportfolio.dto.NewPasswordDTO;
import com.nexola.apiportfolio.entities.PasswordRecover;
import com.nexola.apiportfolio.entities.User;
import com.nexola.apiportfolio.repositories.PasswordRecoverRepository;
import com.nexola.apiportfolio.repositories.UserRepository;
import com.nexola.apiportfolio.services.exceptions.ForbiddenException;
import com.nexola.apiportfolio.services.exceptions.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("${email.password-recover.token.minutes}")
    private Long tokenMinutes;

    @Value("${email.password-recover.uri}")
    private String recoverURI;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordRecoverRepository passwordRecoverRepository;

    @Autowired
    private EmailService emailService;

    public void createRecoverToken(EmailDTO body) {
        User user = userRepository.findByEmail(body.getEmail());
        if (user == null) {
            throw new ResourceNotFoundException("Email não encontrado");
        }

        PasswordRecover entity = new PasswordRecover();
        entity.setEmail(body.getEmail());
        entity.setToken(UUID.randomUUID().toString());
        entity.setExpiration(Instant.now().plusSeconds(tokenMinutes * 60L));

        entity = passwordRecoverRepository.save(entity);

        String bodyEmail = "Acesse o link para definir uma nova senha\n\n"
                + recoverURI + entity.getToken() + "\n\nVálido por " + tokenMinutes + " minutos";

        emailService.sendEmail(entity.getEmail(), "Recuperação de senha", bodyEmail);
    }

    @Transactional
    public void saveNewPassword(NewPasswordDTO body) {
        List<PasswordRecover> result = passwordRecoverRepository.searchValidTokens(body.getToken(), Instant.now());
        if (result.isEmpty()) {
            throw new ResourceNotFoundException("Token inválido");
        }

        User user = userRepository.findByEmail(result.get(0).getEmail());
        user.setPassword(passwordEncoder.encode(body.getPassword()));
        userRepository.save(user);
    }

    public void validateSelfOrAdmin(Long userId) {
        User me = userService.authenticated();
        if (me.hasRole("ROLE_ADMIN")) {
            return;
        }
        if (!me.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }
}
