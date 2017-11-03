package com.example.doit.service;

import com.example.doit.model.Project;

import java.util.List;

public interface ProjectService {

    public void addProject(Project project);
    public void deleteProject(long project);
    public Project getProjectbyId(long id);
    public List<Project> getListProject();

}
