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
 * @author andres
 */
public class Trabajadores extends Thread{
    
    public int cantidadTrabajadores;
    private int diaDuracion;
    private int salario;
    private float salarioAcumulado;
    private int contadorDias;
    private int diasTerminar;
    private Almacen almacen;
    private Semaphore mutex;
    private int type;
    
    
    
    public Trabajadores(int type, int diaDuracion, int cantidad, Almacen almacen, Semaphore mutex, int [] diasTerminar){
        
        this.diasTerminar = diasTerminar[type];
        this.type = type;
        this.cantidadTrabajadores = cantidad;
        this.mutex = mutex;
        this.contadorDias = 0;
        this.almacen = almacen;
        this.salarioAcumulado = 0;
        
        
        if (this.type == 0){
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
    
    public Trabajadores(int type,int cantidad){
        
        this.cantidadTrabajadores = cantidad;
        if (this.type == 0){
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

    
    
    
    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getDiaDuracion() {
        return diaDuracion;
    }

    public void setDiaDuracion(int diaDuracion) {
        this.diaDuracion = diaDuracion;
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

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public int crearComponente(Almacen componente){
        int costo = 0;

            if(this.type == 0){
                if (componente.almacen_pb_a == 0){
                    System.out.println("Almacen de Placas Base lleno, no es posible almacenar más Cpu");
                }else{
                    componente.almacen_pb_a = componente.almacen_pb_a - 1;
                    System.out.println("Cpu creado y almacenado con exito");
                    System.out.println("");
                    costo = this.salario * 48 * this.cantidadTrabajadores;
                    System.out.println("Costo de creación de la placa base: "+ costo+"$");
                    System.out.println(componente.almacen_pb_a);
                }
            }else if(this.type == 1){
                if (componente.almacen_cpu_a == 0){
                    System.out.println("Almacen de Cpu lleno, no es posible almacenar más Cpu");
                }else{
                    componente.almacen_cpu_a = componente.almacen_cpu_a - 1;
                    System.out.println("Cpu creado y almacenado con exito");
                    System.out.println("");
                    costo = this.salario * 48 * this.cantidadTrabajadores;
                    System.out.println("Costo de creación del CPU: "+ costo+ "$");

                }

            }else if (this.type == 2){
                if (componente.almacen_mram_a == 0){
                    System.out.println("Almacen de Memorias Ram lleno, no es posible almacenar más Cpu");
                }else{
                    componente.almacen_cpu_a = componente.almacen_cpu_a - 1;
                    System.out.println("Memoria Ram creado y almacenado con exito");
                    System.out.println("");
                    costo = ((this.salario * 24)/3)*this.cantidadTrabajadores;
                    System.out.println("Costo de creación de la memoria Ram: "+ costo+"$");
                }

            }else if (this.type ==3){
                if (componente.almacen_fa_a == 0){
                    System.out.println("Almacen de Fuentes de alimentación lleno, no es posible almacenar más Cpu");
                }else{
                    componente.almacen_fa_a = componente.almacen_fa_a - 1;
                    System.out.println("Cpu creado y almacenado con exito");
                    System.out.println("");
                    costo = ((this.salario * 24)/3)*this.cantidadTrabajadores;
                    System.out.println("Costo de creación de la fuente de alimentación: "+ costo+"$");
                }

            }else if (this.type ==4){
                if (componente.almacen_tg_a == 0){
                    System.out.println("Almacen de tarjeta grafica lleno, no es posible almacenar más Cpu");
                }else{
                    componente.almacen_tg_a = componente.almacen_tg_a --;
                    System.out.println("Tarjeta Gráfica creada y almacenada con exito");
                    System.out.println("");
                    costo = this.salario * 72 * this.cantidadTrabajadores;
                    System.out.println("Costo de creación de la tarjeta gráfica: "+ costo+"$");
                }
            }
            componente.costos +=costo;
            componente.ganancias =componente.ganancias - componente.costos;
            return costo;
            
            
        }
        
    
    
   
    
    
}