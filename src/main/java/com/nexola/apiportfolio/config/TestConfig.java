package com.nexola.apiportfolio.config;

import com.nexola.apiportfolio.models.embedded.*;
import com.nexola.apiportfolio.models.entities.Portfolio;
import com.nexola.apiportfolio.models.entities.Role;
import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.repositories.PortfolioRepository;
import com.nexola.apiportfolio.repositories.RoleRepository;
import com.nexola.apiportfolio.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        userRepository.deleteAll();
        portfolioRepository.deleteAll();
        roleRepository.deleteAll();

        User vitor = new User(null, "Vitor Vianna", "vitormatheusfv@gmail.com", "$2a$12$xkt3ljT21SVhrhfJSw.6nuqpLHLEuD0DTDFF8FCoLwGFJ8seFE3tO");
        User julio = new User(null, "Julio Bíblico", "julio@gmail.com", "$2a$12$xkt3ljT21SVhrhfJSw.6nuqpLHLEuD0DTDFF8FCoLwGFJ8seFE3tO");

        userRepository.saveAll(Arrays.asList(vitor, julio));

        Header header = new Header("Desenvolvedor Fullstack & Estudante de tecnologia", "São Paulo");
        Footer footer = new Footer("Estou disponível para projetos e oportunidades de estágio/júnior. Entre em contato comigo para marcarmos uma conversa.", "vitormatheusfv@gmail.com", "+55 11 95076-5194", "https://www.instagram.com/_nexola/", "_nexola", "https://github.com/nexola", "https://www.linkedin.com/in/vitor-vianna-a53075215/", "https://drive.google.com/uc?export=download&id=1K1CNOkiD5QW3_Bm9LwUcDEnTencrqQMV");
        Experience experience = new Experience("Estudo análise e desenvolvimento de sistemas e desenvolvo pequenos projetos, com auxílio de ferramentas como Java, HTML, CSS e Javascript, além de trabalhar protótipos de Design UI/UX com Figma");

        Education education = new Education("Descrição");

        Portfolio portfolio = new Portfolio(null, header, footer, experience, education, new Author(vitor));
        Portfolio blankPortfolio = new Portfolio();
        blankPortfolio.setAuthor(new Author(julio));
        portfolioRepository.saveAll(Arrays.asList(portfolio, blankPortfolio));

        Role roleAdmin = new Role(null, "ROLE_ADMIN");
        Role roleUser = new Role(null, "ROLE_USER");

        roleAdmin = roleRepository.save((roleAdmin));
        roleUser = roleRepository.save((roleUser));

        vitor.getRoles().add(roleAdmin);
        vitor.getRoles().add(roleUser);
        vitor.setPortfolio(portfolio);
        julio.setPortfolio(blankPortfolio);
        julio.getRoles().add(roleUser);
        userRepository.saveAll(Arrays.asList(vitor, julio));
    }
}
