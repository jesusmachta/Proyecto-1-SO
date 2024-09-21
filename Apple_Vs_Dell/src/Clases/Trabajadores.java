/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andres
 */
public class Trabajadores {
    
    public int cantidad_trabajadores ;
    public int sueldo_pb;
    public int sueldo_cpu;
    public int sueldo_mram;
    public int sueldo_fa;
    public int sueldo_tg;
    public int sueldo_ensamblador;
    public int sueldo_pm;
    public int sueldo_d;
    
    
    public Trabajadores(){
        this.cantidad_trabajadores = 12;
        //ultimo número 0 del carnet
        this.sueldo_pb = 20;
        //sueldo de los productores de placas base
        this.sueldo_cpu = 26;
        //sueldo de los productores de cpu
        this.sueldo_mram = 40;
        //sueldo de los productores de memoria ram
        this.sueldo_fa = 16;
        //sueldo de los productores de fuentes de alimentación
        this.sueldo_tg = 34;
        //sueldo de los productores de tajetas gráficas
        this.sueldo_ensamblador = 50;
        //sueldo de los ensambladores
        this.sueldo_pm = 40;
        this.sueldo_d = 60;
    }
    
    
}