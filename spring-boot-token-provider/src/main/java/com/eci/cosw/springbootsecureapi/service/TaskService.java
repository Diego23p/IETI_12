package com.eci.cosw.springbootsecureapi.service;

import java.util.List;

import com.eci.cosw.springbootsecureapi.model.Task;

public interface TaskService {

    void postTask(Task task);

    List<Task> allTasks();
    
}
