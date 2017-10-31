package com.example.doit.dao;

import com.example.doit.model.Task;


import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface TaskDao {

    public void addTask(Task task);
    public void updateTask(Task task);
    public void delete(long id);
    public Task getTaskById(long id);
    public List<Task> listTask();



}
