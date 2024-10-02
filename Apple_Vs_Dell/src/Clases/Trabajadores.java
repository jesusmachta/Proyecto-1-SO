/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andres
 */
public class Trabajadores extends Thread {

    public int cantidadTrabajadores;
    private int diaDuracion;
    private int salario;
    private float salarioAcumulado;
    private int contadorDias;
    private int diasTerminar;
    private Almacen almacen;
    private Semaphore mutex;
    private int type;

    public Trabajadores(int type, int diaDuracion, int cantidad, Almacen almacen, Semaphore mutex, int[] diasTerminar) {

        this.diasTerminar = diasTerminar[type];
        this.type = type;
        this.cantidadTrabajadores = cantidad;
        this.mutex = mutex;
        this.contadorDias = 0;
        this.almacen = almacen;
        this.salarioAcumulado = 0;

        if (this.type == 0) {
            this.salario = 20;
        } else if (this.type == 1) {
            this.salario = 26;
        } else if (this.type == 2) {
            this.salario = 40;
        } else if (this.type == 3) {
            this.salario = 16;
        } else if (this.type == 4) {
            this.salario = 34;
        }
    }

    public void pagarSalario() {
        this.setSalarioAcumulado(this.getSalarioAcumulado() + ((this.getSalario() * 24)) * this.getCantidadTrabajadores());
        System.out.println("trab1");
    }

    public void añadirTrabajadores() {
        this.setCantidadTrabajadores(cantidadTrabajadores + 1);
        System.out.println("trab2");
    }

    public void eliminarTrabajador() {
        if (this.getCantidadTrabajadores() != 1) {
            this.setCantidadTrabajadores(this.cantidadTrabajadores - 1);
            System.out.println("trab3");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dejar sin empleados al departamento");
        }
    }

    @Override
    public void run(){
        while (true) {
            try {
                pagarSalario();
                trabajo();
                sleep(this.getDiaDuracion());
                System.out.println("trab4");

            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void trabajo() {
        this.setContadorDias(this.getContadorDias() + 1);
        if (this.getContadorDias() == this.getDiasTerminar()) {
            System.out.println("trab5");
            try {
                this.getMutex().acquire();
                this.getAlmacen().añadirParte(this.getType(), this.getCantidadTrabajadores());
                System.out.println("trab6");
                this.getMutex().release();
                this.setContadorDias(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @return the cantidadTrabajadores
     */
    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }
    /**
     * @param cantidadTrabajadores the cantidadTrabajadores to set
     */
    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }
    /**
     * @return the diaDuracion
     */
    public int getDiaDuracion() {
        return diaDuracion;
    }
    /**
     * @param diaDuracion the diaDuracion to set
     */
    public void setDiaDuracion(int diaDuracion) {
        this.diaDuracion = diaDuracion;
    }
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }
    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    /**
     * @return the salarioAcumulado
     */
    public float getSalarioAcumulado() {
        return salarioAcumulado;
    }
    /**
     * @param salarioAcumulado the salarioAcumulado to set
     */
    public void setSalarioAcumulado(float salarioAcumulado) {
        this.salarioAcumulado = salarioAcumulado;
    }
    /**
     * @return the contadorDias
     */
    public int getContadorDias() {
        return contadorDias;
    }
    /**
     * @param contadorDias the contadorDias to set
     */
    public void setContadorDias(int contadorDias) {
        this.contadorDias = contadorDias;
    }
    /**
     * @return the diasTerminar
     */
    public int getDiasTerminar() {
        return diasTerminar;
    }
    /**
     * @param diasTerminar the diasTerminar to set
     */
    public void setDiasTerminar(int diasTerminar) {
        this.diasTerminar = diasTerminar;
    }
    /**
     * @return the almacen
     */
    public Almacen getAlmacen() {
        return almacen;
    }
    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }
    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
}