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

    public void Guardar(Compañia Dell, Compañia Apple) {
        String directorio = "Apple_Vs_Dell/src/Txt";
        String nombreArchivoApple = directorio + "/Apple.txt";
        String nombreArchivoDell = directorio + "/Dell.txt";

        Almacen apple = Apple.getAlmacen();
        Almacen dell = Dell.getAlmacen();

        // Contenido para Apple
        String[] lineasApple = {
                Apple.getNombre(),
                "Placas Base " + apple.almacen_pb_a,
                "CPU's " + apple.almacen_cpu_a,
                "Memorias Ram " + apple.almacen_mram_a,
                "Fuentes de Alimentación " + apple.almacen_fa_a,
                "Tarjetas Gráficas " + apple.almacen_tg_a,
                "Computadoras Estandar " + apple.almacen_estandar_a,
                "Computadoras con Tarjetas Gráficas " + apple.almacen_full_a,
        };

        // Contenido para Dell
        String[] lineasDell = {
                Dell.getNombre(),
                "Placas Base " + dell.almacen_pb_a,
                "CPU's " + dell.almacen_cpu_a,
                "Memorias Ram " + dell.almacen_mram_a,
                "Fuentes de Alimentación " + dell.almacen_fa_a,
                "Tarjetas Gráficas " + dell.almacen_tg_a,
                "Computadoras Estandar " + dell.almacen_estandar_a,
                "Computadoras con Tarjetas Gráficas " + dell.almacen_full_a,
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

    public void CargarTxt() {
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
    }
}