package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.entities.Education;
import com.nexola.apiportfolio.entities.User;
import com.nexola.apiportfolio.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    @Query("SELECT obj from Education obj " +
            "WHERE obj.user.id = :id")
    Education getEducation(Long id);
}
