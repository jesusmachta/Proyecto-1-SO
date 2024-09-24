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
        Archivo archivo = new Archivo();
        archivo.CrearTxt();
        Almacen almacenDell = new Almacen(25, 20, 55, 35, 10, 0, 0);
        Almacen almacenApple = new Almacen(25, 20, 55, 35, 10, 0, 0);
        Compañia dell = new Compañia("Dell", almacenDell);
        Compañia apple = new Compañia("Apple", almacenApple);
        archivo.Guardar(dell, apple);
        archivo.CargarTxt();
    }
}
