/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JLabel;
import static java.lang.Thread.sleep;


/**
 *
 * @author andres
 */
public class Almacen {
    private int placasBase; // placas base
    private int cpuS; // productores de CPU
    private int memoriaRam; // productores de memoria RAM
    private int fuentesAlimentacion; // productores de fuentes de alimentacion
    private int tarjetasGraficas; // productores de tarjetas graficas
    private int computadoras; // computadora terminada
    private int counterForTG; // crear capitulo con tarjeta grafica
    private int computadoraTG; // computadoras con TarjetaGrafica
    private int[] necesidades;
    private JLabel[] labels;
    private Compañia compañia;

    public Almacen(int[] necesidades, Compañia compañia) {
        this.placasBase = 0;
        this.cpuS = 0;
        this.memoriaRam = 0;
        this.fuentesAlimentacion = 0;
        this.tarjetasGraficas = 0;
        this.computadoras = 0;
        this.counterForTG = 0;
        this.computadoraTG = 0;
        this.necesidades = necesidades;
        this.compañia = compañia;
    }

    public boolean chequear() {
        boolean listo = false;
        System.out.println(listo);
        System.out.println("almacencheck"); 
        if (placasBase >= necesidades[0] && cpuS >= necesidades[1] && memoriaRam >= necesidades[2] && fuentesAlimentacion >= necesidades[3]) {
            listo = true;
            System.out.println("almacencheck2");
            System.out.println(listo);
        }
        return listo;
    }

    public int posiblesComputadoras(int value, int type) {
        int cantidad = value;
        System.out.println(cantidad);
        int quantity = 0;
        System.out.println(quantity);
        System.out.println("almacenposible");
        while (cantidad > 0) {
            int resto = cantidad - necesidades[type];
            if (resto >= 0) {
                quantity += 1;
                System.out.println("almacenposible2");
            }
            cantidad = resto;
            System.out.println("almacenposible");
        }
        return quantity;
    }

    public void añadirParte(int type, int cantidadTrabajadores) {
        if (type == 0 && this.getPlacasBase() < 25) { // Su almacén tiene una capacidad máxima de 25 placas base
            int calcular = this.getPlacasBase() + (1 * cantidadTrabajadores);
            if (calcular < 25) {
                this.setPlacasBase(calcular);
            } else {
                this.setPlacasBase(25);
            }
            this.labels[type].setText(Integer.toString(this.getPlacasBase()));
            System.out.println("almacenc¿placas");
            
        } else if (type == 1 && this.getCpuS() < 20) { // Su almacén tiene una capacidad máxima de 20 CPU
            int calcular = this.getCpuS() + (1 * cantidadTrabajadores);
            if (calcular < 20) {
                this.setCpuS(calcular);
            } else {
                this.setCpuS(20);
            }
            this.labels[type].setText(Integer.toString(this.getCpuS()));
            System.out.println("almacencpu");
            
        } else if (type == 2 && this.getMemoriaRam()< 55) { // Su almacén tiene una capacidad máxima de 55 Memoria
                                                                 // RAM
            int calcular = this.getMemoriaRam() + (3 * cantidadTrabajadores);
            if (calcular < 55) {
                this.setMemoriaRam(calcular);
            } else {
                this.setMemoriaRam(55);
            }
            this.labels[type].setText(Integer.toString(this.getMemoriaRam()));
            System.out.println("almacenram");
            
        } else if (type == 3 && this.getFuentesAlimentacion() < 35) { // Su almacén tiene una capacidad máxima de 35 fuentes de
                                                               // alimentación
            int calcular = this.getFuentesAlimentacion() + (3 * cantidadTrabajadores);
            if (calcular < 35) {
                this.setFuentesAlimentacion(calcular);
            } else {
                this.setFuentesAlimentacion(35);
            }
            this.labels[type].setText(Integer.toString(this.getFuentesAlimentacion()));
            System.out.println("almacenfuente");
            
        } else if (type == 4 && this.getTarjetasGraficas() < 10) { // Su almacén tiene una capacidad máxima de 10 tarjetas
                                                               // gráficas
            int calcular = this.getTarjetasGraficas() + (1 * cantidadTrabajadores);
            if (calcular < 10) {
                this.setTarjetasGraficas(calcular);
            } else {
                this.setTarjetasGraficas(10);
            }
            this.labels[type].setText(Integer.toString(this.getTarjetasGraficas()));
            System.out.println("almacetg");
        }
        chequear();
        System.out.println("almacecheck4");
    }

    public void añadirComputadora(int cantidad_ensabladores) {
        int cantidadComputadoras = cantidad_ensabladores;
        // Para las placas base
        int quantity = posiblesComputadoras(placasBase, 0);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
            System.out.println("almacenadd1");
        }
        // Para los CPU's
        quantity = posiblesComputadoras(cpuS, 1);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
            System.out.println("almacenadd2");
        }
        // Para la memoria RAM
        quantity = posiblesComputadoras(memoriaRam, 2);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
            System.out.println("almacenadd3");
        }
        // Para las fuentes de alimentacion
        quantity = posiblesComputadoras(fuentesAlimentacion, 3);
        if (quantity < cantidadComputadoras) {
            cantidadComputadoras = quantity;
            System.out.println("almacenadd4");
        }
        System.out.println(quantity);
        placasBase -= (necesidades[0] * cantidadComputadoras);
        System.out.println(placasBase);
        this.labels[0].setText(Integer.toString(this.getPlacasBase()));
        cpuS -= (necesidades[1] * cantidadComputadoras);
        System.out.println(cpuS);
        this.labels[1].setText(Integer.toString(this.getCpuS()));
        memoriaRam -= (necesidades[2] * cantidadComputadoras);
        System.out.println(memoriaRam);
        this.labels[2].setText(Integer.toString(this.getMemoriaRam()));
        fuentesAlimentacion -= (necesidades[3] * cantidadComputadoras);
        System.out.println(fuentesAlimentacion);
        this.labels[3].setText(Integer.toString(this.getFuentesAlimentacion()));
        System.out.println("almacenadd5");

        while (counterForTG >= necesidades[5] && tarjetasGraficas >= necesidades[4] && cantidadComputadoras > 0) {
            computadoraTG += 1;
            System.out.println(computadoraTG);
            tarjetasGraficas -= necesidades[4];
            System.out.println(tarjetasGraficas);
            counterForTG -= necesidades[5];
            System.out.println(counterForTG);
            cantidadComputadoras -= 1;
            System.out.println("almacenadd6");
            System.out.println("cantidadComputadoras");
        }
        this.labels[4].setText(Integer.toString(this.getTarjetasGraficas()));
        computadoras += cantidadComputadoras;
        counterForTG += cantidadComputadoras;
        this.labels[5].setText(Integer.toString(computadoras));
        this.labels[6].setText(Integer.toString(computadoraTG));
        System.out.println(computadoras);
        System.out.println(counterForTG);
    }

    public void enviarComputadora() {
        this.compañia.setGanancias(this.compañia.getGanancias() + (this.compañia.getPrecioComputadora() * computadoras));
        this.compañia.setGanancias(this.compañia.getGanancias() + (this.compañia.getPrecioComputadoraTG() * counterForTG));
        this.labels[7].setText(Integer.toString(this.compañia.getGanancias()));
        computadoras = 0;
        counterForTG = 0;
        this.labels[5].setText(Integer.toString(computadoras));
        this.labels[6].setText(Integer.toString(counterForTG));
        System.out.println(computadoras);
        System.out.println(counterForTG);
    }

    /**
     * @return the placasBase
     */
    public int getPlacasBase() {
        return placasBase;
    }
    /**
     * @param placasBase the placasBase to set
     */
    public void setPlacasBase(int placasBase) {
        this.placasBase = placasBase;
    }
    /**
     * @return the cpuS
     */
    public int getCpuS() {
        return cpuS;
    }
    /**
     * @param cpuS the cpuS to set
     */
    public void setCpuS(int cpuS) {
        this.cpuS = cpuS;
    }
    /**
     * @return the memoriaRam
     */
    public int getMemoriaRam() {
        return memoriaRam;
    }
    /**
     * @param memoriaRam the memoriaRam to set
     */
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    /**
     * @return the fuentesAlimentacion
     */
    public int getFuentesAlimentacion() {
        return fuentesAlimentacion;
    }
    /**
     * @param fuentesAlimentacion the fuentesAlimentacion to set
     */
    public void setFuentesAlimentacion(int fuentesAlimentacion) {
        this.fuentesAlimentacion = fuentesAlimentacion;
    }
    /**
     * @return the tarjetasGraficas
     */
    public int getTarjetasGraficas() {
        return tarjetasGraficas;
    }
    /**
     * @param tarjetasGraficas the tarjetasGraficas to set
     */
    public void setTarjetasGraficas(int tarjetasGraficas) {
        this.tarjetasGraficas = tarjetasGraficas;
    }

    public int getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(int computadoras) {
        this.computadoras = computadoras;
    }

    public int getCounterForTG() {
        return counterForTG;
    }

    public void setCounterForTG(int counterForTG) {
        this.counterForTG = counterForTG;
    }

    public int getComputadoraTG() {
        return computadoraTG;
    }

    public void setComputadoraTG(int computadoraTG) {
        this.computadoraTG = computadoraTG;
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
