package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.entities.Education;
import com.nexola.apiportfolio.entities.Header;
import com.nexola.apiportfolio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Long> {

    @Query("SELECT obj from Header obj " +
            "WHERE obj.user.id = :id")
    Header getHeader(Long id);
}
