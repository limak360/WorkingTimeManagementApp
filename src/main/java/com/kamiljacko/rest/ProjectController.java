package com.kamiljacko.rest;

import com.kamiljacko.entity.Project;
import com.kamiljacko.service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

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