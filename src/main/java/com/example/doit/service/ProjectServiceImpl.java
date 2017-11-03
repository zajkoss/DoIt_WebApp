package com.example.doit.service;

import com.example.doit.dao.ProjectDao;
import com.example.doit.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;


    @Override
    public void addProject(Project project) {
        this.projectDao.addProject(project);
    }

    @Override
    public void deleteProject(long project) {
        this.projectDao.deleteProject(project);

    }

    @Override
    public Project getProjectbyId(long id) {
        return  projectDao.getProjectbyId(id);
    }

    @Override
    public List<Project> getListProject() {
        return this.projectDao.getListProject();
    }
}
