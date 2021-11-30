package com.imaf6971.taskmanager.service.impl;

import com.imaf6971.taskmanager.persistence.model.Project;
import com.imaf6971.taskmanager.persistence.repository.ProjectRepository;
import com.imaf6971.taskmanager.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    public Optional<Project> getProjectById(Long id) {
        return repository.findById(id);
    }

    public Project saveProject(Project project) {
        return repository.save(project);
    }
}
