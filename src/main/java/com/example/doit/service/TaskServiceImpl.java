package com.example.doit.service;

import com.example.doit.dao.ProjectDao;
import com.example.doit.dao.TaskDao;
import com.example.doit.dao.TaskDaoImpl;
import com.example.doit.model.Project;
import com.example.doit.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
        this.taskDao.addTask(task);

    }

    @Override
    public void updateTask(Task task) {
        this.taskDao.updateTask(task);
    }

    @Override
    public void delete(long id) {
        this.taskDao.delete(id);
    }

    @Override
    public Task getTaskById(long id) {
        return taskDao.getTaskById(id);
    }

    @Override
    public List<Task> listTask() {
        return this.taskDao.listTask();
    }


}
