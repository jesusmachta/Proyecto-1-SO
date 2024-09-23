/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jesusmachta
 */
public class Compañia {
    public String nombre;
    public Almacen almacen;
    
    
    public Compañia(String nombre, Almacen almacen) {
        this.nombre = nombre;
        this.almacen = almacen;
    }
    public Almacen getAlmacen() {
        return almacen;
    }
    

    public String getNombre() {
        return nombre;
    }
}


