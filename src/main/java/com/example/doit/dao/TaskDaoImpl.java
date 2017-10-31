package com.example.doit.dao;

import com.example.doit.model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class TaskDaoImpl implements TaskDao {



    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTask(Task task) {
            entityManager.persist(task);
    }

    @Override
    public void updateTask(Task task) {
            entityManager.merge(task);
    }

    @Override
    public void delete(long id) {
       Task task = entityManager.find(Task.class,id);
       if(task != null)
           entityManager.remove(task);


    }

    @Override
    public Task getTaskById(long id) {
        return entityManager.find(Task.class,id);

    }

    @Override
    public List<Task> listTask() {
        List<Task> taskList = entityManager.createQuery("from Task").getResultList();
        return taskList;
    }
}
