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

    public void añadirParte() {

    }

    public void añadirComputadora() {

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
