package com.example.doit.dao;

import com.example.doit.model.Task;

import java.util.List;

public interface TaskDao {

    public void addTask(Task task);
    public void updateTask(Task task);
    public void delete(long id);
    public void getTaskById(long id);
    public List<Task> listTask();



}
