package com.example.doit.controller;


import com.example.doit.model.Project;
import com.example.doit.model.Task;
import com.example.doit.service.ProjectService;
import com.example.doit.service.TaskService;
import com.example.doit.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    ProjectService projectService;

    /*
      Task
     */
    @GetMapping("/task")
    public String getTasks(){
        return this.taskService.listTask().toString();
    }


    /*
    * Other solutions?!
    * Check
    * */
    @PostMapping("/task/add")
    public String addTask(@Valid @ModelAttribute Task task ,@RequestParam("projectid")long projectid, BindingResult result){
        if(!result.hasErrors()) {
            task.setProject(projectService.getProjectbyId(projectid));
            this.taskService.addTask(task);
            return task.toString();
        }else{
            return "Some problem";
        }
    }

    @DeleteMapping("/task/delete")
    public String removeTask(@RequestParam("id") long id){
        try {
            this.taskService.delete(id);
        }catch(Exception e){
            return "Error DELETE method " + id;
        }
            return  "DELETE TASK WITH ID: " + id;
    }

    @GetMapping("/task/{id}")
    public String getTask(@PathVariable("id") long id){
        return  taskService.getTaskById(id).toString();
    }



    @PostMapping("/task/update")
    public String updateTask(@RequestParam("id") long id,@RequestParam("task_description") String task_descirption ,@RequestParam("priority") int priority ){
        try{
            Task task = taskService.getTaskById(id);
            task.setTask_description(task_descirption);
            task.setPriority(priority);
            taskService.updateTask(task);
        }catch (Exception e ){
            return "Something gone wrong";
        }

        return taskService.getTaskById(id).toString();


    }














}

