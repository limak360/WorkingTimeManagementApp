package com.kamiljacko.dao;

import com.kamiljacko.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private final SessionFactory sessionFactory;
    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public EmployeeDAOImpl(SessionFactory sessionFactory, JdbcTemplate jdbcTemplate) {
        this.sessionFactory = sessionFactory;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveEmployee(Employee theEmployee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(theEmployee);
    }

    @Override
    public Employee getEmployee(int employeeId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Employee.class, employeeId);
    }

    @Override
    public void deleteEmployee(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Query theQuery =
                session.createQuery("delete from Employee where id=:employeeId");
        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }

    @Override
    public void deleteHoursEmployee(int employeeId, int projectId) {
        String sql = "UPDATE project_employee SET hours = 0 WHERE employee_id=" + employeeId + " and project_id=" + projectId;

        jdbcTemplate.execute(sql);
        System.out.println("Record deleted successfully");
    }
}
