package com.example.doit.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    private long id;

    private String task_description;

    private int priority;


    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    @ManyToOne
    @JoinColumn(name = "id_project")
    Project project ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task_description='" + task_description + '\'' +
                ", priority=" + priority +
                ", date=" + date +
                ", project=" + project +
                '}';
    }
}
