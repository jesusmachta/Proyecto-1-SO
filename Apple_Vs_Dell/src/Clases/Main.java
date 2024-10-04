/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Interfaces.MainInterface;
import java.awt.TextField;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Archivo archivo = new Archivo();
        try {
            FileReader reader = new FileReader("DatosInicializados.txt");
            String contenido = "";
            int valores = reader.read();
            while (valores != -1) {
                contenido += (char) valores;
                valores = reader.read();
            }

            String[] primeraDivision = contenido.split(" / ");

            reader = new FileReader("CantidadesIniciales.txt");
            contenido = "";
            valores = reader.read();
            while (valores != -1) {
                contenido += (char) valores;
                valores = reader.read();
            }

            String[] segundaDivision = contenido.split(" / ");
            int diaDuracion = Integer.parseInt(primeraDivision[0].replaceAll("\\p{C}", ""));
            int fechaTope = Integer.parseInt(primeraDivision[1].replaceAll("\\p{C}", ""));

            // Para Apple
            int[] cantidadInicialesApple = new int[6];
            for (int i = 0; i < 6; i++) {
                cantidadInicialesApple[i] = Integer.parseInt(segundaDivision[0].split(", ")[i]);
            }
            int[] necesidadesApple = new int[6];
            necesidadesApple[0] = 2; // 2 Placas base
            necesidadesApple[1] = 1; // 1 CPU
            necesidadesApple[2] = 4; // 4 memorias RAM
            necesidadesApple[3] = 4; // 4 fuentes de alimentacion
            necesidadesApple[4] = 2; // 2 trajetas Graficas
            necesidadesApple[5] = 5; // 5 Computadoras

            int[] diasTerminarApple = new int[5]; // andres 20211110360
            diasTerminarApple[0] = 2; // 1 placa base cada 2 dias
            diasTerminarApple[1] = 2; // 1 CPU cada 2 Dias
            diasTerminarApple[2] = 1; // 3 memoria RAM cada dia
            diasTerminarApple[3] = 1; // 3 fuente de alimentacion cada dia
            diasTerminarApple[4] = 3; // 1 tarjeta grafica cada 3 dias

            Compañia apple = new Compañia(necesidadesApple, diasTerminarApple, cantidadInicialesApple, 15, diaDuracion,
                    100000, 150000, fechaTope);

            // Para Dell
            int[] cantidadInicialesDell = new int[6];
            for (int i = 0; i < 6; i++) {
                cantidadInicialesDell[i] = Integer.parseInt(segundaDivision[1].split(", ")[i]);
            }
            int[] necesidadesDell = new int[6];
            necesidadesDell[0] = 1; // 1 Placa Base
            necesidadesDell[1] = 5; // 5 CPU's
            necesidadesDell[2] = 6; // 6 Memorias Ram
            necesidadesDell[3] = 5; // 5 Fuentes de Alimentación
            necesidadesDell[4] = 1; // 1 Tarejta Grafica
            necesidadesDell[5] = 3; // 3 Computadoras

            int[] diasTerminarDell = new int[5]; // andrea 20201110583
            diasTerminarDell[0] = 3; // 1 placa base cada 3 dias
            diasTerminarDell[1] = 3; // 1 CPU cada 3 dias
            diasTerminarDell[2] = 1; // 2 memorias RAM cada dia
            diasTerminarDell[3] = 1; // 3 fuentes de alimentacion cada dia
            diasTerminarDell[4] = 3; // 1 tarjeta grafica cada dia

            Compañia dell = new Compañia(necesidadesDell, diasTerminarDell, cantidadInicialesDell, 15, diaDuracion, 80000,
                    120000, fechaTope);
            // A partir de aca se llama a las interfaces
            MainInterface main = new MainInterface(apple, dell, cantidadInicialesApple, cantidadInicialesDell);
            main.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
