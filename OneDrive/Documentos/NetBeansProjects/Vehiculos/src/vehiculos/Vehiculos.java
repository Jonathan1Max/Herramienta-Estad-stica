/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author J MAX
 */
public abstract class Vehiculos implements IVehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculos(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public abstract void arrancar();

    @Override
    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }

    public String getInfo() {
        return marca + " " + modelo + " (" + año + ")";
    }
}
