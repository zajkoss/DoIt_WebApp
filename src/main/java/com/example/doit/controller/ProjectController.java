package com.example.doit.controller;

import com.example.doit.model.Project;
import com.example.doit.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProjectController {


    @Autowired
    ProjectService projectService;

    @PostMapping("/project/add")
    public String addProject(@ModelAttribute Project project){
        projectService.addProject(project);
        return  project.toString();
    }

    @GetMapping("/project/{id}")
    public String getProjectById(@PathVariable("id") long id){
        return projectService.getProjectbyId(id).toString();
    }

    @GetMapping("/project/all")
    public String getAllProejct(){
        return projectService.getListProject().toString();
    }

    @DeleteMapping("/project/delete")
    public String removeProject(@RequestParam("id") long id){
        try {
            projectService.deleteProject(id);
        }catch (Exception e){
            return "error deleting project";
        }
        return "delete project id: " +id;
    }

}
