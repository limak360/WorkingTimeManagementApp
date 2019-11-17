package com.KamilJacko.dao;

import com.KamilJacko.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveProject(Project theProject) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(theProject);
    }

    @Override
    public Project getProject(int projectId) {

        Session session = sessionFactory.getCurrentSession();
        Project project = session.get(Project.class, projectId);

        return project;
    }

    @Override
    public void deleteProject(int theId) {

        String sql = "delete from projects where id="+theId;

            jdbcTemplate.execute(sql);
            System.out.println("Record deleted successfully");
    }
}
