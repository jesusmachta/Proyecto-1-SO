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
 * @author andreapinto & jesusmachta & andrespaz
 */
public class Director extends Thread {
    private float salarioAcumulado;
    private int diaDuracion;
    private int salario;
    private int contadorDias;
    private int diasTerminar;
    private boolean modoDirector;
    private int reinicioFechaTope;
    private String status;
    private Almacen almacen;
    private Compañia compañia;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private JLabel[] labels;

    public Director(int diaDuracion, Almacen almacen, Semaphore mutex, Semaphore mutex2,
            Semaphore mutex3, Compañia compañia) {
        this.salarioAcumulado = 0;
        this.diaDuracion = diaDuracion;
        this.salario = 60;
        this.contadorDias = 0;
        this.diasTerminar = 1;
        this.modoDirector = false;
        this.reinicioFechaTope = compañia.getFechaTope();
        this.almacen = almacen;
        this.compañia = compañia;
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.mutex3 = mutex3;
    }

    public void chequearProjectManager() {
        if (compañia.getProjectManager().getStatus().equals("Viendo al Red de los Piratas")) {
            compañia.getProjectManager().setFalta(compañia.getProjectManager().getFalta() + 1);
            this.labels[2].setText(Integer.toString(compañia.getProjectManager().getFalta()));
            compañia.getProjectManager().setDescontado(compañia.getProjectManager().getDescontado() + 100);
            this.labels[3].setText(Integer.toString(compañia.getProjectManager().getDescontado()));
            try {
                this.mutex3.acquire();
                compañia.getProjectManager()
                        .setSalarioAcumulado(compañia.getProjectManager().getSalarioAcumulado() - 100); // le colocara
                                                                                                        // una falta y
                                                                                                        // le descontara
                                                                                                        // $100 de su //
                                                                                                        // sueldo
                this.mutex3.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void pagarSalario() {
        this.salarioAcumulado = this.salarioAcumulado + (this.salario * 24);
    }

    public void chequearFechaTope() {
        try {
            this.mutex2.acquire();
            if (this.compañia.getFechaTope() == 0) {
                modoDirector = true;
                this.compañia.setFechaTope(reinicioFechaTope);
                this.labels[1].setText(Integer.toString(this.compañia.getFechaTope()));
            }
            this.mutex2.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void trabajo() {
        this.contadorDias = this.contadorDias + 1;
        if (this.contadorDias == this.diasTerminar) {
            try {
                this.mutex.acquire();
                getAlmacen().enviarComputadora();
                this.mutex.release();
                this.contadorDias = 0;
                modoDirector = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void ejecutar() {
        while (true) {
            try {
                pagarSalario();
                chequearFechaTope();
                if (modoDirector) {
                    status = "Enviando Computadoras";
                    this.labels[0].setText(status);
                    trabajo();
                    sleep(this.diaDuracion);
                } else {
                    double horaRandom = Math.random() * 23;
                    int random = (int) horaRandom;
                    sleep((this.diaDuracion * random) / 24);
                    status = "Chequeando al Project Manager";
                    this.labels[0].setText(status);
                    chequearProjectManager();
                    sleep((diaDuracion * 30) / (24 * 60));
                    chequearProjectManager();
                    sleep((diaDuracion * 5) / (24 * 60));
                    status = "Labores Administrativos";
                    this.labels[0].setText(status);
                    sleep((diaDuracion * 25) / (60 * 24));
                    sleep((this.diaDuracion * (23 - random)) / 24);
                }
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

    public boolean isModoDirector() {
        return modoDirector;
    }

    public void setModoDirector(boolean modoDirector) {
        this.modoDirector = modoDirector;
    }

    public int getReinicioFechaTope() {
        return reinicioFechaTope;
    }

    public void setReinicioFechaTope(int reinicioFechaTope) {
        this.reinicioFechaTope = reinicioFechaTope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
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

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

}
