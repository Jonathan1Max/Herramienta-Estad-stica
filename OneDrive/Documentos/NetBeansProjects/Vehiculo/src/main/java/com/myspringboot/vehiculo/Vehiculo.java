/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myspringboot.vehiculo;

/**
 *
 * @author J MAX
 */
public abstract class Vehiculo implements IVehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public abstract void arrancar();  // Método abstracto, cada subclase debe implementarlo

    @Override
    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }

    public String getInfo() {
        return marca + " " + modelo + " (" + año + ")";
    }
}