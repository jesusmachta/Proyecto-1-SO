/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jesusmachta
 */
public class Compañia extends Thread {

    private Trabajadores placasBase;
    private Trabajadores cpuS;
    private Trabajadores memoriaRam;
    private Trabajadores fuentesAlimentacion;
    private Trabajadores tarjetasGraficas;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private int[] necesidades;
    private int[] diasTerminar;
    private int[] cantidadInicial;
    private int maximoTrabajadores;
    private int diaDuracion;
    private int precioComputadora;
    private int precioComputadoraTG; // precio de compu con Tarjeta Grafica
    private int ganancias;
    private int costos;
    private int utilidades;
    private int fechaTope;
    private Almacen almacen;
    private Director director;
    private ProjectManager ProjectManager;
    private Ensamblador ensamblador;

    public Compañia(int[] necesidades, int[] diasTerminar, int[] cantidadInicial, int maximoTrabajadores,
            int diaDuracion, int precioComputadora, int fechaTope) {
        this.necesidades = necesidades;
        this.diasTerminar = diasTerminar;
        this.cantidadInicial = cantidadInicial;
        this.maximoTrabajadores = maximoTrabajadores;
        this.diaDuracion = diaDuracion;
        this.precioComputadora = precioComputadora;
        this.precioComputadoraTG = precioComputadoraTG;
        this.fechaTope = fechaTope;
        this.ganancias = 0;
        this.costos = 0;
        this.utilidades = 0;
        this.almacen = new Almacen(necesidades, this);
        this.mutex = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        this.mutex3 = new Semaphore(1);
        instanciarTrabajadores();
    }

    public void calcularCostos() {
        this.costos = (int) (placasBase.getSalarioAcumulado() + cpuS.getSalarioAcumulado()
                + memoriaRam.getSalarioAcumulado() + fuentesAlimentacion.getSalarioAcumulado()
                + tarjetasGraficas.getSalarioAcumulado() + ensamblador.getCantidadTrabajadores());
    }

    public void totalUtilidades() {
        this.utilidades = this.ganancias - this.costos;
    }

    public void instanciarTrabajadores() {
        placasBase = new Trabajadores(0, diaDuracion, cantidadInicial[0], almacen, mutex, diasTerminar);
        cpuS = new Trabajadores(1, diaDuracion, cantidadInicial[1], almacen, mutex, diasTerminar);
        memoriaRam = new Trabajadores(2, diaDuracion, cantidadInicial[2], almacen, mutex, diasTerminar);
        fuentesAlimentacion = new Trabajadores(3, diaDuracion, cantidadInicial[3], almacen, mutex, diasTerminar);
        tarjetasGraficas = new Trabajadores(4, diaDuracion, cantidadInicial[4], almacen, mutex, diasTerminar);
        ensamblador = new Ensamblador(diaDuracion, cantidadInicial[5], almacen, mutex);
        director = new Director(diaDuracion, almacen, mutex, mutex2, mutex3, this);
        ProjectManager = new ProjectManager(diaDuracion, mutex, mutex2, mutex3, this);
    }

    public void startEmpleados() {
        placasBase.start();
        cpuS.start();
        memoriaRam.start();
        fuentesAlimentacion.start();
        tarjetasGraficas.start();
        ensamblador.start();
        ProjectManager.start();
        director.start();
        // Director Y ProjectManager so hijos ya que ambos tienen acceso al contador de
        // la fechaTope
    }

    public void añadirTrabajadores(int type) {
        int contadorActualTrabajadores = (placasBase.getCantidadTrabajadores() + cpuS.getCantidadTrabajadores()
                + memoriaRam.getCantidadTrabajadores() + fuentesAlimentacion.getCantidadTrabajadores()
                + tarjetasGraficas.getCantidadTrabajadores() + ensamblador.getCantidadTrabajadores());
        if (contadorActualTrabajadores < getMaximoTrabajadores()) {
            if (type == 0) {
                placasBase.addTrabajador();
            }
            if (type == 1) {
                cpuS.addTrabajador();
            }
            if (type == 2) {
                memoriaRam.addTrabajador();
            }
            if (type == 3) {
                fuentesAlimentacion.addTrabajador();
            }
            if (type == 4) {
                tarjetasGraficas.addTrabajador();
            }
            if (type == 5) {
                ensamblador.addTrabajador();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se pueden añadir mas trabajadores. Se ha superado la cantidad limite.");
        }
    }

    public int[] getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int[] cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public Trabajadores getPlacasBase() {
        return placasBase;
    }

    public void setPlacasBase(Trabajadores placasBase) {
        this.placasBase = placasBase;
    }

    public Trabajadores getCpuS() {
        return cpuS;
    }

    public void setCpuS(Trabajadores cpuS) {
        this.cpuS = cpuS;
    }

    public Trabajadores getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Trabajadores memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Trabajadores getFuentesAlimentacion() {
        return fuentesAlimentacion;
    }

    public void setFuentesAlimentacion(Trabajadores fuentesAlimentacion) {
        this.fuentesAlimentacion = fuentesAlimentacion;
    }

    public Trabajadores getTarjetasGraficas() {
        return tarjetasGraficas;
    }

    public void setTarjetasGraficas(Trabajadores tarjetasGraficas) {
        this.tarjetasGraficas = tarjetasGraficas;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Semaphore getMutex2() {
        return mutex2;
    }

    public void setMutex2(Semaphore mutex2) {
        this.mutex2 = mutex2;
    }

    public Semaphore getMutex3() {
        return mutex3;
    }

    public void setMutex3(Semaphore mutex3) {
        this.mutex3 = mutex3;
    }

    public int[] getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int[] necesidades) {
        this.necesidades = necesidades;
    }

    public int[] getDiasTerminar() {
        return diasTerminar;
    }

    public void setDiasTerminar(int[] diasTerminar) {
        this.diasTerminar = diasTerminar;
    }

    public int getMaximoTrabajadores() {
        return maximoTrabajadores;
    }

    public void setMaximoTrabajadores(int maximoTrabajadores) {
        this.maximoTrabajadores = maximoTrabajadores;
    }

    public int getDiaDuracion() {
        return diaDuracion;
    }

    public void setDiaDuracion(int diaDuracion) {
        this.diaDuracion = diaDuracion;
    }

    public int getPrecioComputadora() {
        return precioComputadora;
    }

    public void setPrecioComputadora(int precioComputadora) {
        this.precioComputadora = precioComputadora;
    }

    public int getPrecioComputadoraTG() {
        return precioComputadoraTG;
    }

    public void setPrecioComputadoraTG(int precioComputadoraTG) {
        this.precioComputadoraTG = precioComputadoraTG;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }

    public int getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(int utilidades) {
        this.utilidades = utilidades;
    }

    public int getFechaTope() {
        return fechaTope;
    }

    public void setFechaTope(int fechaTope) {
        this.fechaTope = fechaTope;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ProjectManager getProjectManager() {
        return ProjectManager;
    }

    public void setProjectManager(ProjectManager ProjectManager) {
        this.ProjectManager = ProjectManager;
    }

    public Ensamblador getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(Ensamblador ensamblador) {
        this.ensamblador = ensamblador;
    }

}
