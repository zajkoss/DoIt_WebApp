package com.example.doit.service;

import com.example.doit.model.Project;
import com.example.doit.model.Task;

import java.util.List;

public interface TaskService {

    public void addTask(Task task);
    public void updateTask(Task task);
    public void delete(long id);
    public Task getTaskById(long id);
    public List<Task> listTask();
    public void addProject(Project project);
    public void deleteProject(long project);
    public Project getProjectbyId(long id);
    public List<Project> getListProject();
}
