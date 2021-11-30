package com.imaf6971.taskmanager.persistence.model;

import java.time.LocalDate;
import java.util.Objects;

public class Project {

    private Long id;

    private String name;

    private LocalDate creationDate;

    public Project() {

    }

    public Project(Project project) {
        this(project.getId(), project.getName(), project.getCreationDate());
    }

    public Project(Long id, String name, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(creationDate, project.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creationDate);
    }
}
