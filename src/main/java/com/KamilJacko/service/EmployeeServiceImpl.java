package com.KamilJacko.service;

import com.KamilJacko.dao.EmployeeDAO;
import com.KamilJacko.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl
        implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

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





