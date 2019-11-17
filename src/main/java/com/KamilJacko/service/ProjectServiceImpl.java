package com.KamilJacko.service;

import com.KamilJacko.dao.ProjectDAO;
import com.KamilJacko.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectServiceImpl
        implements ProjectService {

    @Autowired
    private ProjectDAO projectDAO;


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
