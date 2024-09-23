/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Interfaces.MainI;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author andres
 */
public class Main {
    public static void main(String[] args) {
    
        
        //MainI Main = new MainI();
        //Main.setVisible(true);
        
        Almacen a = new Almacen();
        Compañia Apple = new Compañia("Apple", a);
        Almacen d = new Almacen();
        Compañia Dell = new Compañia("Dell", d);
        
        System.out.println(Dell.getAlmacen().getAlmacen_cpu_a());
        Archivo ar = new Archivo();
        
        
        
        ar.CargarTxt();
        ar.Guardar(Dell, Apple);
        
        
        
        
      

        
        
    }
    
}
