package com.kamiljacko.service;

import com.kamiljacko.entity.Project;

public interface ProjectService {
    void saveProject(Project theProject);

    Project getProject(int projectId);

    void deleteProject(int theId);
}