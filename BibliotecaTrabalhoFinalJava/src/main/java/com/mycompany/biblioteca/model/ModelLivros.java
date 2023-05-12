/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Aluno TDS
 */
public class ModelLivros {
    private String actor;
    private String title;
    private String category;
    private String year;
    private String code;
    
    public ModelLivros(String actor, String title, String category, String year, String code) {
        this.actor = actor;
        this.title = title;
        this.category = category;
        this.year = year;
        this.code = code;
    }
    public String getActor() {
        return actor;
    }
    
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getCode() {
        return code;
    }
    public void setIndice(String code) {
        this.code = code;
    }
}
