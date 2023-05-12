/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Aluno TDS
 */
public class ModelAutor {
    private String name;
    private String cpf;
    private String numberPhone;
    
    public ModelAutor(String name, String cpf, String numberPhone) {
        this.name = name;
        this.cpf = cpf;
        this.numberPhone = numberPhone;
    }
    public String getNome() {
        return name;
    }
    
    public void setNome(String name) {
        this.name = name;
    }
    public String getCPF() {
        return cpf;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return numberPhone;
    }
    public void setTelefone(String telefone) {
        this.numberPhone = numberPhone;
    }
}
