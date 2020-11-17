package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

/**
 * @author Diego Puerto
 * 22/10/2020
 */
public class Task {

    private String descripcion = "";

    private String responsible = "";

    private String status = "";

    private Date dueDate;

    public Task(){}

    public Task(String descripcion, String responsible, String status, Date dueDate) {
        this.descripcion = descripcion;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task [descripcion=" + descripcion + ", dueDate=" + dueDate + ", responsible=" + responsible
                + ", status=" + status + "]";
    }
    
}
