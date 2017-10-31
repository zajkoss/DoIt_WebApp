package com.example.doit.dao;


import com.example.doit.model.Project;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ProjectDao {

    public void addProject(Project project);
    public void deleteProject(Project project);
    public Project getProjectbyId(long id);
    public List<Project> getListProject();
}
