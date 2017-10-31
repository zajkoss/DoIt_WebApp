package com.example.doit.dao;

import com.example.doit.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void addProject(Project project) {
        entityManager.persist(project);
    }

    @Override
    public void deleteProject(long id) {
        Project project = entityManager.find(Project.class,id);
        if(project != null){
            entityManager.remove(project);
        }
    }

    @Override
    public Project getProjectbyId(long id) {
        return entityManager.find(Project.class,id);
    }

    @Override
    public List<Project> getListProject() {
        return entityManager.createQuery("from Project").getResultList();

    }
}
