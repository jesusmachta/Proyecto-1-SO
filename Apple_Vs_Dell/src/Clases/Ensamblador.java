/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;

/**
 *
 * @author jesusmachta
 */
public class Ensamblador extends Thread {

    private Semaphore mutex;
    private Almacen almacen;
    private int diaDuracion;
    private int cantidadTrabajadores;
    private int salario;
    private float salarioAcumulado;
    private int contadorDias;
    private int diasTerminar;

    public Ensamblador(int diaDuracion, int cantidad, Almacen almacen, Semaphore mutex) {
        this.cantidadTrabajadores = cantidad;
        this.salarioAcumulado = 0;
        this.diaDuracion = diaDuracion;
        this.almacen = almacen;
        this.contadorDias = 0;
        this.salario = 50;
        this.diasTerminar = 2;
        this.mutex = mutex;
    }

    public boolean chequear() {
        boolean listo = false;
        try {
            this.mutex.acquire();
            listo = this.almacen.chequear();
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

    public void pagarSalario() {
        this.salarioAcumulado = ((this.salario * 24) * this.cantidadTrabajadores) + (this.salarioAcumulado);
    }

    // uso add en vez de añadir para no tener que usar la 'ñ'
    public void addTrabajador() {
        this.cantidadTrabajadores = 1 + this.cantidadTrabajadores;
    }

    public void eliminarTrabajador() {
        if (this.cantidadTrabajadores != 1) {
            this.cantidadTrabajadores = this.cantidadTrabajadores - 1;
        }
    }

    public void run() {
        while (true) {
            try {
                pagarSalario();
                if (contadorDias == 0) {
                    if (chequear()) {
                        trabajo();
                    }
                } else {
                    trabajo();
                }
                sleep(this.diaDuracion); // espera a que termine el dia
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void trabajo() {
        this.contadorDias = this.contadorDias + 1;
        if (this.contadorDias == this.diasTerminar) {
            try {
                this.mutex.acquire();
                this.almacen.añadirComputadora(this.cantidadTrabajadores);
                this.mutex.release();
                this.contadorDias = 0;
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public int getDiaDuracion() {
        return diaDuracion;
    }

    public void setDiaDuracion(int diaDuracion) {
        this.diaDuracion = diaDuracion;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getSalarioAcumulado() {
        return salarioAcumulado;
    }

    public void setSalarioAcumulado(float salarioAcumulado) {
        this.salarioAcumulado = salarioAcumulado;
    }

    public int getContadorDias() {
        return contadorDias;
    }

    public void setContadorDias(int contadorDias) {
        this.contadorDias = contadorDias;
    }

    public int getDiasTerminar() {
        return diasTerminar;
    }

    public void setDiasTerminar(int diasTerminar) {
        this.diasTerminar = diasTerminar;
    }

    // public int crearComputadorApple(Almacen almacen,int cantidad_ensabladores){
    // int ganancia = 0;
    // int costo = 0;
    // if(almacen.almacen_estandar_a % 6 == 0){
    // if(almacen.almacen_pb_a>=2){
    // almacen.almacen_pb_a += -2;
    // if(almacen.almacen_cpu_a>=1){
    // almacen.almacen_cpu_a += -1;
    // if(almacen.almacen_mram_a>=4){
    // almacen.almacen_mram_a += -4;
    // if(almacen.almacen_fa_a>=4){
    // almacen.almacen_fa_a +=-4;
    // if(almacen.almacen_tg_a>=2){
    // almacen.almacen_tg_a+= -2;
    // System.out.println("Computador creado con exito!!!");

    // almacen.costos += cantidad_ensabladores * 48 *50;
    // almacen.ganancias += 150000;
    // almacen.almacen_full_a +=1;
    // }else{
    // System.out.println("No hay suficientes tarjetas gráficas para crear el
    // computador");
    // }
    // }else{
    // System.out.println("No hay suficientes fuentes de alimentación para crear el
    // computador");
    // }

    // }else{
    // System.out.println("No hay suficientes memorias ram para crear el
    // computador");
    // }

    // }else{
    // System.out.println("No hay CPU's suficientes para crear el computador");
    // }
    // }else{
    // System.out.println("No hay placas base suficientes para crear el
    // computador");
    // }
    // }else{
    // if(almacen.almacen_pb_a>=2){
    // almacen.almacen_pb_a += -2;
    // if(almacen.almacen_cpu_a>=1){
    // almacen.almacen_cpu_a += -1;
    // if(almacen.almacen_mram_a>=4){
    // almacen.almacen_mram_a += -4;
    // if(almacen.almacen_fa_a>=4){
    // almacen.almacen_fa_a +=-4;
    // System.out.println("Computador creado con exito!!!");
    // almacen.ganancias += 100000;
    // almacen.costos += cantidad_ensabladores * 50 * 48;
    // almacen.almacen_estandar_a += 1;
    // }else{
    // System.out.println("No hay suficientes fuentes de alimentación para crear el
    // computador");
    // }

    // }else{
    // System.out.println("No hay suficientes memorias ram para crear el
    // computador");
    // }

    // }else{
    // System.out.println("No hay CPU's suficientes para crear el computador");
    // }
    // }else{
    // System.out.println("No hay placas base suficientes para crear el
    // computador");
    // }

    // }return ganancia;
    // }

}
