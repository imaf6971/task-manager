package com.imaf6971.taskmanager.service;

import com.imaf6971.taskmanager.persistence.model.Project;

import java.util.Optional;

public interface ProjectService {
    Optional<Project> getProjectById(Long id);

    Project saveProject(Project project);
}
