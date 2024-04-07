/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.test.arquitecturas.ws.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@XmlRootElement 
public class Sueldo {
       
         private int sueldo;

        /**
         * @return the salary
         */
        @XmlElement
        public int getSueldo() {
            return sueldo;
        }

        /**
         * @param salary the salary to set
         */
        public void setSueldo(int salary) {
            this.sueldo = salary;
        }
    }