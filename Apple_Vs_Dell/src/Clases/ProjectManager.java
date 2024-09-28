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

/**
 *
 * @author andreapinto
 */
public class ProjectManager extends Thread {

    private float salarioAcumulado;
    private int diaDuracion;
    private int salario;
    private int falta;
    private int descontado;
    private int contadorMinutos;
    private int contadorHoras;
    private int totalDiasTranscurridos;
    private String status;
    private JLabel[] labels;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private Compañia compañia;

    public ProjectManager(int diaDuracion, Semaphore mutex, Semaphore mutex2, Semaphore mutex3, Compañia compañia) {
        this.salarioAcumulado = 0;
        this.diaDuracion = diaDuracion;
        this.salario = 40; // El PM cobra $40 la hora esté trabajando o esté viendo anime
        this.falta = 0;
        this.descontado = 0;
        this.totalDiasTranscurridos = 0;
        this.status = "Viendo al Rey de los Piratas";
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.mutex3 = mutex3;
    }

    public void pagarSalario() {
        try {
            this.mutex3.acquire();
            salarioAcumulado = this.salarioAcumulado + (this.salario * 24);
            this.mutex3.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calcular() {
        try {
            this.mutex3.acquire();
            this.compañia.calcularCostos();
            this.labels[1].setText(Integer.toString(this.compañia.getCostos()));
            this.compañia.totalUtilidades();
            this.labels[2].setText(Integer.toString(this.compañia.getUtilidades()));
            this.mutex3.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void trabajo() {
        try {
            this.mutex2.acquire();
            this.compañia.setFechaTope(this.compañia.getFechaTope() - 1);
            this.labels[3].setText(Integer.toString(this.compañia.getFechaTope()));
            this.mutex2.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        while (true) {
            try {
                pagarSalario();
                calcular();
                // a tal punto que las primeras 16 horas del día logra ver anime a escondidas.
                long comenzarTiempo = System.currentTimeMillis();
                while (System.currentTimeMillis() - comenzarTiempo <= ((diaDuracion / 24) * 16)) {
                    status = "Viendo al Rey de los Piratas";
                    this.labels[0].setText(status);
                    sleep(((diaDuracion / 24) / 2));
                    status = "Chequeando";
                    this.labels[0].setText(status);
                    // chequeando();
                    sleep(((diaDuracion / 24) / 2));
                }
                // Las últimas 8 horas del día las invierte cambiando el contador con los días
                // restantes para la entrega
                status = "Chambeando";
                this.labels[0].setText(status);
                trabajo();
                setTotalDiasTranscurridos(getTotalDiasTranscurridos() + 1);
                this.labels[4].setText(Integer.toString(getTotalDiasTranscurridos()));
                if (compañia.getMaximoTrabajadores() == 15) { // Carnet Andrea 202011110583 3 + 12 = 15
                    // Cada estudio cuenta con: último número del carnet del desarrollador + 12
                    // trabajadores
                    this.labels[5].setText(Integer.toString(getTotalDiasTranscurridos()));
                }
                sleep((diaDuracion / 24));
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public float getSalarioAcumulado() {
        return salarioAcumulado;
    }

    public void setSalarioAcumulado(float salarioAcumulado) {
        this.salarioAcumulado = salarioAcumulado;
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

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public int getDescontado() {
        return descontado;
    }

    public void setDescontado(int descontado) {
        this.descontado = descontado;
    }

    public int getContadorMinutos() {
        return contadorMinutos;
    }

    public void setContadorMinutos(int contadorMinutos) {
        this.contadorMinutos = contadorMinutos;
    }

    public int getContadorHoras() {
        return contadorHoras;
    }

    public void setContadorHoras(int contadorHoras) {
        this.contadorHoras = contadorHoras;
    }

    public int getTotalDiasTranscurridos() {
        return totalDiasTranscurridos;
    }

    public void setTotalDiasTranscurridos(int totalDiasTranscurridos) {
        this.totalDiasTranscurridos = totalDiasTranscurridos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
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

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }

}
