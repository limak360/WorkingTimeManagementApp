package com.kamiljacko.dao;

import com.kamiljacko.entity.Employee;

public interface EmployeeDAO {
    void saveEmployee(Employee employee);

    Employee getEmployee(int employeeId);

    void deleteEmployee(int id);

    void deleteHoursEmployee(int employeeId, int projectId);
}