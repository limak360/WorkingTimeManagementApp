package com.kamiljacko.service;

import com.kamiljacko.entity.Employee;

public interface EmployeeService {
    void saveEmployee(Employee theEmployee);

    Employee getEmployee(int employeeId);

    void deleteEmployee(int theId);

    void deleteHoursEmployee(int employeeId, int projectId);
}