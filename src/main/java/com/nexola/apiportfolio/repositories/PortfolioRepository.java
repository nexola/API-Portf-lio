package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.models.entities.Portfolio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends MongoRepository<Portfolio, String> {
}
