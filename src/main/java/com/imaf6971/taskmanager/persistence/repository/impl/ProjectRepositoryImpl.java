package com.imaf6971.taskmanager.persistence.repository.impl;

import com.imaf6971.taskmanager.persistence.model.Project;
import com.imaf6971.taskmanager.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    private final Set<Project> projects = new HashSet<>();

    @PostConstruct
    public void setProjects() {
        projects.add(new Project(0L, "Learn Java", LocalDate.now()));
        projects.add(new Project(1L, "Learn Spring and Spring Boot", LocalDate.now()));
        projects.add(new Project(2L, "Get hired!", LocalDate.now()));
        System.out.println("PostConstruct!");
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.parallelStream()
                .filter(project -> project.getId().equals(id))
                .findFirst();
    }

    @Override
    public Project save(Project project) {
        projects.add(project);
        return project;
    }
}
