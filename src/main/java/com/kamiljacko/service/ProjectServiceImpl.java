package com.kamiljacko.service;

import com.kamiljacko.dao.ProjectDAO;
import com.kamiljacko.entity.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectServiceImpl
        implements ProjectService {
    private final ProjectDAO projectDAO;

    public ProjectServiceImpl(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    @Override
    @Transactional
    public void saveProject(Project theProject) {
        projectDAO.saveProject(theProject);
    }

    @Override
    @Transactional
    public Project getProject(int projectId) {
        return projectDAO.getProject(projectId);
    }

    @Override
    @Transactional
    public void deleteProject(int theId) {
        projectDAO.deleteProject(theId);
    }
}