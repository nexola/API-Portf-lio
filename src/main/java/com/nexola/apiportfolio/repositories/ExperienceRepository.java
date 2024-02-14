package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.entities.Experience;
import com.nexola.apiportfolio.entities.Footer;
import com.nexola.apiportfolio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    @Query("SELECT obj from Experience obj " +
            "WHERE obj.user.id = :id")
    Experience getExperience(Long id);
}
