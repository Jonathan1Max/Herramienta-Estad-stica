/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myspringboot.vehiculo;

/**
 *
 * @author J MAX
 */
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo Auto = new Auto("Toyota", "Corolla", 2021, 4);
        Vehiculo moto = new Moto("Honda", "CB500", 2019, true);

        Auto.arrancar();
        moto.arrancar();   

        Auto.detener();   
        moto.detener();   
    }
}
