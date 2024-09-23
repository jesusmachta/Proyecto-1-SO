/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EstructurasDeDatos.Listas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author uni
 */
public class Archivo {
    
    public void CrearTxt(){
        String nombreArchivo = "almacen.txt";
        
        try {
            // Crear el archivo
            File archivo = new File(nombreArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        }catch (IOException e) {
                System.out.println("Ocurrió un error.");
                e.printStackTrace();
        }
    }
    
    public void Guardar(Compañia Dell, Compañia Apple){
        String nombreArchivo = "almacen.txt"; // Nombre del archivo
        
        Almacen apple = Apple.getAlmacen();
        Almacen dell = Dell.getAlmacen();
        
        
        

        // Contenido que se quiere escribir línea por línea
        String[] lineas = {
            Dell.getNombre(),
            "Placas Base " + dell.almacen_pb_a,
            "CPU's " + dell.almacen_cpu_a,
            "Memorias Ram "+ dell.almacen_mram_a,
            "Fuentes de Alimentación "+ dell.almacen_fa_a,
            "Tarjetas Gráficas " + dell.almacen_tg_a,
            "Computadoras Estandar " + dell.almacen_estandar_a,
            "Computadoras con Tarjetas Gráficas "+ dell.almacen_full_a,
            "",
            "",
            Apple.getNombre(),
            "Placas Base " + apple.almacen_pb_a ,
            "CPU's " + apple.almacen_cpu_a,
            "Memorias Ram "+ apple.almacen_mram_a,
            "Fuentes de Alimentación "+ apple.almacen_fa_a,
            "Tarjetas Gráficas " + apple.almacen_tg_a,
            "Computadoras Estandar " + apple.almacen_estandar_a,
            "Computadoras con Tarjetas Gráficas "+ apple.almacen_full_a,
        };
        
        
        BufferedWriter writer = null;

        try {
            // Crear el archivo y el escritor
            File archivo = new File(nombreArchivo);
            writer = new BufferedWriter(new FileWriter(archivo));

            // Escribir cada línea en el archivo
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine(); // Añadir nueva línea
            }

            System.out.println("Contenido escrito en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        } finally {
            // Cerrar el escritor
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        }
        
    
        
    }
    
    public void CargarTxt(){
        String nombreArchivo = "almacen.txt"; // Nombre del archivo
        Listas list = new Listas();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            Pattern pattern = Pattern.compile("\\d+"); // Expresión regular para encontrar números

            while ((linea = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(linea);
                while (matcher.find()) {
                    // Convertir el número encontrado a entero y agregarlo a la lista
                    list.insertFinal(Integer.parseInt(matcher.group()));
                }
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }

        // Imprimir los números encontrados
        list.printList();
    }
    
    
    


      

    
    
}
