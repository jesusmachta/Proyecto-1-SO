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
public class Ensamblador extends Thread{
    
    private Semaphore mutex;
    private Almacen almacen;
    private int diaDuracion;
    private int cantidadTrabajadores;
    private int salario;
    private float salarioAcumulado;
    private int contadorDias;
    private int diasTerminar;

    public Ensamblador(int diaDuracion, int cantidad, Almacen almacen, Semaphore mutex){
        this.cantidadTrabajadores = cantidad;
        this.salarioAcumulado = 0;
        this.diaDuracion = diaDuracion;
        this.almacen = almacen;
        this.contadorDias = 0;
        this.salario = 50;
        this.diasTerminar = 2;
        this.mutex = mutex;
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
