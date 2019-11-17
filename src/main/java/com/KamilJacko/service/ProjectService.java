package com.KamilJacko.service;

import com.KamilJacko.entity.Project;

public interface ProjectService {

    void saveProject(Project theProject);

    Project getProject(int projectId);

    void deleteProject(int theId);

}
