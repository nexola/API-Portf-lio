package com.nexola.apiportfolio.repositories;

import com.nexola.apiportfolio.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("select distinct obj " +
            "from Project obj  " +
            "join obj.technologies technologies " +
            "where obj.experience.user.id = :id")
    List<Project> getProjects(Long id);
}
