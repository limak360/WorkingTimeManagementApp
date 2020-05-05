package com.kamiljacko.dao;

import com.kamiljacko.entity.Project;

public interface ProjectDAO {
    void saveProject(Project project);

    Project getProject(int projectId);

    void deleteProject(int id);
}