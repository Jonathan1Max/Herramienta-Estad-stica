/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author J MAX
 */
public class Moto extends Vehiculos {
    private final boolean tieneMaletero;

    public Moto(String marca, String modelo, int año, boolean tieneMaletero) {
        super(marca, modelo, año);
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public void arrancar() {
        System.out.println("La moto " + getInfo() + " está arrancando con botón.");
    }

    public boolean tieneMaletero() {
        return tieneMaletero;
    }
}