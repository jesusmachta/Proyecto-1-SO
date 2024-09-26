package Clases;

import EstructurasDeDatos.Listas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archivo {

    public void CrearTxt() {
        String directorio = "Apple_Vs_Dell/src/Txt";
        String[] nombresArchivos = { directorio + "/Apple.txt", directorio + "/Dell.txt" };

        // Crear el directorio si no existe
        File dir = new File(directorio);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (String nombreArchivo : nombresArchivos) {
            try {
                // Crear el archivo
                File archivo = new File(nombreArchivo);
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getName());
                } else {
                    System.out.println("El archivo ya existe: " + archivo.getName());
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el archivo: " + nombreArchivo);
                e.printStackTrace();
            }
        }
    }

    public void Guardar(Almacen dell, Almacen apple) {
        
        String directorio = "Apple_Vs_Dell/src/Txt";
        String nombreArchivoApple = directorio + "/Apple.txt";
        String nombreArchivoDell = directorio + "/Dell.txt";
        apple.ganancias = apple.ganancias - apple.costos ;
        System.out.println(dell.ganancias);
        
       
        

        // Contenido para Apple
        String[] lineasApple = {
                "Apple",
                "Placas Base " + apple.almacen_pb_a,
                "CPU's " + apple.almacen_cpu_a,
                "Memorias Ram " + apple.almacen_mram_a,
                "Fuentes de Alimentación " + apple.almacen_fa_a,
                "Tarjetas Gráficas " + apple.almacen_tg_a,
                "Computadoras Estandar " + apple.almacen_estandar_a,
                "Computadoras con Tarjetas Gráficas " + apple.almacen_full_a,
                "Costos Operativos " + apple.costos,
                "Ganancias Brutas " + apple.ganancias
        
        };

        // Contenido para Dell
        String[] lineasDell = {
                "Dell",
                "Placas Base " + dell.almacen_pb_a,
                "CPU's " + dell.almacen_cpu_a,
                "Memorias Ram " + dell.almacen_mram_a,
                "Fuentes de Alimentación " + dell.almacen_fa_a,
                "Tarjetas Gráficas " + dell.almacen_tg_a,
                "Computadoras Estandar " + dell.almacen_estandar_a,
                "Computadoras con Tarjetas Gráficas " + dell.almacen_full_a,
                "Costos Operativos " + dell.costos,
                "Ganancias Brutas " + dell.ganancias
        };

        escribirArchivo(nombreArchivoApple, lineasApple);
        escribirArchivo(nombreArchivoDell, lineasDell);
    }

    private void escribirArchivo(String nombreArchivo, String[] lineas) {
        BufferedWriter writer = null;
        try {
            // Crear el archivo y el escritor
            File archivo = new File(nombreArchivo);
            writer = new BufferedWriter(new FileWriter(archivo));

            // Escribir cada línea en el archivo
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }

            System.out.println("Contenido escrito en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + nombreArchivo);
            e.printStackTrace();
        } finally {
            // Cerrar el escritor
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + nombreArchivo);
                }
            }
        }
    }

    public void CargarTxt(Almacen a, Almacen d) {
        String directorio = "Apple_Vs_Dell/src/Txt";
        String[] nombresArchivos = { directorio + "/Apple.txt", directorio + "/Dell.txt" };
        Listas list = new Listas();

        for (String nombreArchivo : nombresArchivos) {
            try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                Pattern pattern = Pattern.compile("\\d+");

                while ((linea = reader.readLine()) != null) {
                    Matcher matcher = pattern.matcher(linea);
                    while (matcher.find()) {
                        list.insertFinal(Integer.parseInt(matcher.group()));
                    }
                }

            } catch (IOException e) {
                System.out.println("Ocurrió un error al leer el archivo: " + nombreArchivo);
                e.printStackTrace();
            }
        }

        // Imprimir los números encontrados
        list.printList();
        a.almacen_pb_a = list.getNumber(0);
        a.almacen_cpu_a = list.getNumber(1);
        a.almacen_mram_a = list.getNumber(2);
        a.almacen_fa_a = list.getNumber(3);
        a.almacen_tg_a = list.getNumber(4);
        a.almacen_estandar_a = list.getNumber(5);
        a.almacen_full_a = list.getNumber(6);
        a.costos = list.getNumber(7);
        a.ganancias = list.getNumber(8);
        d.almacen_pb_a = list.getNumber(9);
        d.almacen_cpu_a = list.getNumber(10);
        d.almacen_mram_a = list.getNumber(11);
        d.almacen_fa_a = list.getNumber(12);
        d.almacen_tg_a = list.getNumber(13);
        d.almacen_estandar_a = list.getNumber(14);
        d.almacen_full_a = list.getNumber(15);
        d.costos = list.getNumber(16);
        d.ganancias = list.getNumber(17);
    }
}