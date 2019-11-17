package com.KamilJacko.dao;

import com.KamilJacko.entity.Project;

public interface ProjectDAO {

    void saveProject(Project project);

    Project getProject(int projectId);

    void deleteProject(int id);
}
