/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JLabel;

/**
 *
 * @author andres
 */
public class Almacen {
    private int almacen_pb_a; // placas base
    private int almacen_cpu_a; // productores de CPU
    private int almacen_mram_a; // productores de memoria RAM
    private int almacen_fa_a; // productores de fuentes de alimentacion
    private int almacen_tg_a; // productores de tarjetas graficas
    private int almacen_computadoras; // computadora terminada
    private int almacen_contador_tg; // crear capitulo con tarjeta grafica
    private int tarjetaGrafica; // computadoras con TarjetaGrafica
    private int[] necesidades;
    private JLabel[] labels;
    private Compañia compañia;

    public Almacen(int[] necesidades, Compañia compañia) {
        this.almacen_pb_a = 0;
        this.almacen_cpu_a = 0;
        this.almacen_mram_a = 0;
        this.almacen_fa_a = 0;
        this.almacen_tg_a = 0;
        this.almacen_computadoras = 0;
        this.almacen_contador_tg = 0;
        this.tarjetaGrafica = 0;
        this.necesidades = necesidades;
        this.compañia = compañia;
    }

    public boolean chequear() {
        boolean listo = false;
        if (almacen_pb_a >= necesidades[0] && almacen_cpu_a >= necesidades[1] && almacen_mram_a >= necesidades[2]
                && almacen_fa_a >= necesidades[3]) {
            listo = true;
        }
        return listo;
    }

    public int posiblesComputadoras(int value, int type) {
        int cantidad = value;
        int quantity = 0;
        while (cantidad > 0) {
            int resto = cantidad - necesidades[type];
            if (resto >= 0) {
                quantity += 1;
            }
            cantidad = resto;
        }
        return quantity;
    }

    public void añadirParte(int type, int cantidadTrabajadores) {
        if (type == 0 && this.getAlmacen_pb_a() < 25) { // Su almacén tiene una capacidad máxima de 25 placas base
            int calcular = this.getAlmacen_pb_a() + (cantidadTrabajadores * 1);
            if (calcular < 25) {
                this.setAlmacen_pb_a(calcular);
            } else {
                this.setAlmacen_pb_a(25);
            }
            this.labels[type].setText(Integer.toString(this.getAlmacen_pb_a()));
        } else if (type == 1 && this.getAlmacen_cpu_a() < 20) { // Su almacén tiene una capacidad máxima de 20 CPU
            int calcular = this.getAlmacen_cpu_a() + (cantidadTrabajadores * 1);
            if (calcular < 20) {
                this.setAlmacen_cpu_a(calcular);
            } else {
                this.setAlmacen_cpu_a(20);
            }
            this.labels[type].setText(Integer.toString(this.getAlmacen_cpu_a()));
        } else if (type == 2 && this.getAlmacen_mram_a() < 55) { // Su almacén tiene una capacidad máxima de 55 Memoria
                                                                 // RAM
            int calcular = this.getAlmacen_mram_a() + (cantidadTrabajadores * 1);
            if (calcular < 55) {
                this.setAlmacen_mram_a(calcular);
            } else {
                this.setAlmacen_mram_a(55);
            }
            this.labels[type].setText(Integer.toString(this.getAlmacen_mram_a()));
        } else if (type == 3 && this.getAlmacen_fa_a() < 35) { // Su almacén tiene una capacidad máxima de 35 fuentes de
                                                               // alimentación
            int calcular = this.getAlmacen_fa_a() + (cantidadTrabajadores * 1);
            if (calcular < 35) {
                this.setAlmacen_fa_a(calcular);
            } else {
                this.setAlmacen_fa_a(35);
            }
            this.labels[type].setText(Integer.toString(this.getAlmacen_fa_a()));
        } else if (type == 4 && this.getAlmacen_tg_a() < 10) { // Su almacén tiene una capacidad máxima de 10 tarjetas
                                                               // gráficas
            int calcular = this.getAlmacen_tg_a() + (cantidadTrabajadores * 1);
            if (calcular < 10) {
                this.setAlmacen_tg_a(calcular);
            } else {
                this.setAlmacen_tg_a(10);
            }
            this.labels[type].setText(Integer.toString(this.getAlmacen_tg_a()));
        }
        chequear();
    }

    public void añadirComputadora(int cantidad_ensabladores) {
        int cantidadComputadoras = cantidad_ensabladores;
        // Para las placas base
        int quantity = posiblesComputadoras(almacen_pb_a, 0);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
        }
        // Para los CPU's
        quantity = posiblesComputadoras(almacen_cpu_a, 0);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
        }
        // Para la memoria RAM
        quantity = posiblesComputadoras(almacen_mram_a, 0);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
        }
        // Para las fuentes de alimentacion
        quantity = posiblesComputadoras(almacen_fa_a, 0);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
        }
        almacen_pb_a -= (necesidades[0] * cantidadComputadoras);
        this.labels[0].setText(Integer.toString(this.getAlmacen_pb_a()));
        almacen_cpu_a -= (necesidades[1] * cantidadComputadoras);
        this.labels[1].setText(Integer.toString(this.getAlmacen_cpu_a()));
        almacen_mram_a -= (necesidades[2] * cantidadComputadoras);
        this.labels[2].setText(Integer.toString(this.getAlmacen_mram_a()));
        almacen_fa_a -= (necesidades[3] * cantidadComputadoras);
        this.labels[3].setText(Integer.toString(this.getAlmacen_fa_a()));
        almacen_computadoras += cantidadComputadoras;

        while (almacen_contador_tg >= necesidades[5] && almacen_tg_a >= necesidades[4] && cantidadComputadoras > 0) {
            tarjetaGrafica += 1;
            almacen_tg_a -= necesidades[4];
            almacen_contador_tg -= necesidades[5];
            cantidadComputadoras -= 1;
        }
        this.labels[4].setText(Integer.toString(this.getAlmacen_tg_a()));
        almacen_computadoras += cantidadComputadoras;
        almacen_contador_tg += cantidadComputadoras;
        this.labels[5].setText(Integer.toString(almacen_computadoras));
        this.labels[6].setText(Integer.toString(tarjetaGrafica));
    }

    public void enviarComputadora() {

    }

    public int getAlmacen_pb_a() {
        return almacen_pb_a;
    }

    public void setAlmacen_pb_a(int almacen_pb_a) {
        this.almacen_pb_a = almacen_pb_a;
    }

    public int getAlmacen_cpu_a() {
        return almacen_cpu_a;
    }

    public void setAlmacen_cpu_a(int almacen_cpu_a) {
        this.almacen_cpu_a = almacen_cpu_a;
    }

    public int getAlmacen_mram_a() {
        return almacen_mram_a;
    }

    public void setAlmacen_mram_a(int almacen_mram_a) {
        this.almacen_mram_a = almacen_mram_a;
    }

    public int getAlmacen_fa_a() {
        return almacen_fa_a;
    }

    public void setAlmacen_fa_a(int almacen_fa_a) {
        this.almacen_fa_a = almacen_fa_a;
    }

    public int getAlmacen_tg_a() {
        return almacen_tg_a;
    }

    public void setAlmacen_tg_a(int almacen_tg_a) {
        this.almacen_tg_a = almacen_tg_a;
    }

    public int getAlmacen_computadoras() {
        return almacen_computadoras;
    }

    public void setAlmacen_computadoras(int almacen_computadoras) {
        this.almacen_computadoras = almacen_computadoras;
    }

    public int getAlmacen_contador_tg() {
        return almacen_contador_tg;
    }

    public void setAlmacen_contador_tg(int almacen_contador_tg) {
        this.almacen_contador_tg = almacen_contador_tg;
    }

    public int getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(int tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int[] getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int[] necesidades) {
        this.necesidades = necesidades;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }
}
