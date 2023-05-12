/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Aluno TDS
 */
public class ModelClientes {
    private String nameClient;
    private String cpfClient;
    private String numberPhoneClient;
    
    public ModelClientes(String nameClient, String cpfClient, String numberPhoneClient) {
        this.nameClient = nameClient;
        this.cpfClient = cpfClient;
        this.numberPhoneClient = numberPhoneClient;
    }
    public String getNome() {
        return nameClient;
    }
    
    public void setNome(String nome) {
        this.nameClient = nameClient;
    }
    public String getCPF() {
        return cpfClient;
    }
    public void setCPF(String cpf) {
        this.cpfClient = cpfClient;
    }
    public String getTelefone() {
        return numberPhoneClient;
    }
    public void setTelefone(String telefone) {
        this.numberPhoneClient = numberPhoneClient;
    }
}
