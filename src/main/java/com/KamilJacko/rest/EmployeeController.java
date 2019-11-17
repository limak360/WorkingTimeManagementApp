package com.KamilJacko.rest;

import com.KamilJacko.entity.Employee;
import com.KamilJacko.entity.Project;
import com.KamilJacko.service.EmployeeService;
import com.KamilJacko.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee theEmployee) {

        employeeService.saveEmployee(theEmployee);

        return theEmployee;
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {

        Employee tempEmployee = employeeService.getEmployee(employeeId);

        if (tempEmployee == null) {
            throw new NotFoundException("Employee id not found - " + employeeId);
        }

        employeeService.deleteEmployee(employeeId);

        return "Deleted customer id - " + employeeId;
    }

    @PutMapping()
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        employeeService.saveEmployee(theEmployee);

        return theEmployee;
    }

    @DeleteMapping(value = "/{employeeId}/{projectId}")
    public String deleteHoursEmployee(@PathVariable("employeeId") int employeeId, @PathVariable("projectId") int projectId) {

        Employee tempEmployee = employeeService.getEmployee(employeeId);
        Project tempProject = projectService.getProject(projectId);

        if ((tempEmployee == null) || (tempProject == null)) {
            throw new NotFoundException("Employee id or Project id not found");
        }

        employeeService.deleteHoursEmployee(employeeId, projectId);

        return "Deleted hours from employee of id - " + employeeId;
    }
}
