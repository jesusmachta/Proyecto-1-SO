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
        System.out.println("enam1");
        try {
            this.mutex.acquire();
            listo = this.almacen.chequear();
            System.out.println("enam2");
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

    public void pagarSalario() {
        this.salarioAcumulado = this.salarioAcumulado + ((this.salario * 24) * this.cantidadTrabajadores);
        System.out.println("enam3");
    }

    public void añadirTrabajadores() {
        this.cantidadTrabajadores = this.cantidadTrabajadores + 1;
        System.out.println("enam4");
    }

    public void eliminarTrabajador() {
        if (this.cantidadTrabajadores != 1) {
            this.cantidadTrabajadores = this.cantidadTrabajadores - 1;
            System.out.println("enam5");
        }
    }

    @Override
    public void run(){
        while (true) {
            try {
                pagarSalario();
                System.out.println("enam6");
                if (contadorDias == 0) {
                    if (chequear()) {
                        trabajo();
                    }
                } else {
                    trabajo();
                    System.out.println("enam7");
                }
                sleep(this.diaDuracion); // espera a que termine el dia
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void trabajo() {
        this.contadorDias = this.contadorDias + 1;
        System.out.println("enam8");
        if (this.contadorDias == this.diasTerminar) {
            try {
                this.mutex.acquire();
                System.out.println("enam9");
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
}
    
    