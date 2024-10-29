/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myspringboot.vehiculo;

/**
 *
 * @author J MAX
 */
public class Auto extends Vehiculo {
    private int numeroDePuertas;

    public Auto(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);  // Llamamos al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche " + getInfo() + " está arrancando con llave.");
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}
