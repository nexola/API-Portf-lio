package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.models.projections.UserDetailsProjection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ email : ?0 }")
    UserDetailsProjection searchUserAndRolesByEmail(String username);

    Optional<User> findByEmail(String email);
}
