package com.example.doit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue
    private long id_project;

    private String project_color;

    private String project_name;

    @Override
    public String toString() {
        return "Project{" +
                "id_project=" + id_project +
                ", project_color='" + project_color + '\'' +
                ", project_name='" + project_name + '\'' +
                '}';
    }

    public long getId_project() {
        return id_project;
    }

    public void setId_project(long id_project) {
        this.id_project = id_project;
    }

    public String getProject_color() {
        return project_color;
    }

    public void setProject_color(String project_color) {
        this.project_color = project_color;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }




}
