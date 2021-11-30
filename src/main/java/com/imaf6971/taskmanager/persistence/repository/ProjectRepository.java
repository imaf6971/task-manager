package com.imaf6971.taskmanager.persistence.repository;

import com.imaf6971.taskmanager.persistence.model.Project;

import java.util.Optional;

public interface ProjectRepository {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
