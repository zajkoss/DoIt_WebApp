package com.example.doit.dao;

import com.example.doit.model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



public class TaskDaoImpl implements TaskDao {



    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void getTaskById(long id) {

    }

    @Override
    public List<Task> listTask() {
        return null;
    }
}
