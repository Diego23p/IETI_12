package com.eci.cosw.springbootsecureapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.eci.cosw.springbootsecureapi.model.Task;

@Service
public class TaskServiceImpl implements TaskService {

    private List<Task> taskList = new ArrayList<>();

    @PostConstruct
    private void populateSampleData()
    {
        taskList.add( new Task( "Hacer back", "diego.puerto@mail", "In Progress", new Date() ) );
    }

    @Override
    public void postTask(Task task) {
        
        taskList.add( new Task( "test", "test@mail", "In Progress", new Date() ) );

    }

    @Override
    public List<Task> allTasks() {

        return taskList;
    }
    
}
