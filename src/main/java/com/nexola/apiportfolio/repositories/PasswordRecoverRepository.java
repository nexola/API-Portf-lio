package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.models.entities.PasswordRecover;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface PasswordRecoverRepository extends MongoRepository<PasswordRecover, String> {

    @Query("{ $and: [{ token: ?0 }, { expiration : { $gt: ?1 } } ] }")
    List<PasswordRecover> searchValidTokens(String token, Instant now);
}
