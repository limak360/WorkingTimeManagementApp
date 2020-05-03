package com.kamiljacko.service;

import com.kamiljacko.dao.EmployeeDAO;
import com.kamiljacko.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl
        implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        employeeDAO.saveEmployee(theEmployee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int theId) {
        return employeeDAO.getEmployee(theId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeDAO.deleteEmployee(theId);
    }

    @Override
    public void deleteHoursEmployee(int employeeId, int projectId) {
        employeeDAO.deleteHoursEmployee(employeeId, projectId);
    }
}