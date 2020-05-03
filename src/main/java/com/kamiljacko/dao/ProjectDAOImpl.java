package com.kamiljacko.dao;

import com.kamiljacko.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
    private final SessionFactory sessionFactory;
    private final JdbcTemplate jdbcTemplate;

    public ProjectDAOImpl(SessionFactory sessionFactory, JdbcTemplate jdbcTemplate) {
        this.sessionFactory = sessionFactory;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveProject(Project theProject) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(theProject);
    }

    @Override
    public Project getProject(int projectId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Project.class, projectId);
    }

    @Override
    public void deleteProject(int theId) {
        String sql = "delete from projects where id=" + theId;

        jdbcTemplate.execute(sql);
        System.out.println("Record deleted successfully");
    }
}