package com.KamilJacko.dao;

import com.KamilJacko.entity.Employee;

public interface EmployeeDAO {

     void saveEmployee(Employee employee);

     Employee getEmployee(int employeeId);

     void deleteEmployee(int id);

     void deleteHoursEmployee(int employeeId, int projectId);
}
