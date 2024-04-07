/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.test.arquitecturas.ws.entity;

/**
 *
 * @author Usuario
 */
public class Persona {
    private int id;
    private String fullName;
    private int age;
    private Sueldo salario; 
    public static final int minSalary = 1300000;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public Sueldo getSalario() {
        return salario;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalario(int salario) {
        this.salario = new Sueldo();
        this.salario.setSueldo(salario);
    }
}
