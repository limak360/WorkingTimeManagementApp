package com.KamilJacko.rest;

import com.KamilJacko.entity.Project;
import com.KamilJacko.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping()
    public Project createProject(@RequestBody Project theProject) {


        projectService.saveProject(theProject);

        return theProject;
    }

    @DeleteMapping("/{projectId}")
    public String deleteProject(@PathVariable int projectId) {

        Project tempProject = projectService.getProject(projectId);

        if (tempProject == null) {
            throw new NotFoundException("Project id not found - " + projectId);
        }

        projectService.deleteProject(projectId);

        return "Deleted project id - " + projectId;
    }

    @PutMapping()
    public Project updateProject(@RequestBody Project theProject) {

        projectService.saveProject(theProject);

        return theProject;

    }
}
