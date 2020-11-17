package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.ServletException;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Diego Puerto
 * 22/10/2020
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping( "api" )
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping( value = "/postTask", method = RequestMethod.POST )
    public ResponseEntity<?> postTask(@RequestBody Task task) {
        try {
            taskService.postTask(task);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping( value = "/allTasks", method = RequestMethod.GET )
    public ResponseEntity<?> allTasks() {
        try {
            return new ResponseEntity<>(taskService.allTasks(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
