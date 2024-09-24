/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andres
 */
public class Almacen {
    int almacen_pb_a;
    int almacen_cpu_a;
    int almacen_mram_a;
    int almacen_fa_a;
    int almacen_tg_a;
    int almacen_estandar_a;
    int almacen_full_a;

    public Almacen(int pb, int cpu, int mram, int fa, int tg, int estandar, int full) {
        this.almacen_pb_a = pb;
        this.almacen_cpu_a = cpu;
        this.almacen_mram_a = mram;
        this.almacen_fa_a = fa;
        this.almacen_tg_a = tg;
        this.almacen_estandar_a = estandar;
        this.almacen_full_a = full;
    }

    public int getAlmacen_pb_a() {
        return almacen_pb_a;
    }

    public void setAlmacen_pb_a(int almacen_pb_a) {
        this.almacen_pb_a = almacen_pb_a;
    }

    public int getAlmacen_cpu_a() {
        return almacen_cpu_a;
    }

    public void setAlmacen_cpu_a(int almacen_cpu_a) {
        this.almacen_cpu_a = almacen_cpu_a;
    }

    public int getAlmacen_mram_a() {
        return almacen_mram_a;
    }

    public void setAlmacen_mram_a(int almacen_mram_a) {
        this.almacen_mram_a = almacen_mram_a;
    }

    public int getAlmacen_fa_a() {
        return almacen_fa_a;
    }

    public void setAlmacen_fa_a(int almacen_fa_a) {
        this.almacen_fa_a = almacen_fa_a;
    }

    public int getAlmacen_tg_a() {
        return almacen_tg_a;
    }

    public void setAlmacen_tg_a(int almacen_tg_a) {
        this.almacen_tg_a = almacen_tg_a;
    }

    public int getAlmacen_estandar_a() {
        return almacen_estandar_a;
    }

    public void setAlmacen_estandar_a(int almacen_estandar_a) {
        this.almacen_estandar_a = almacen_estandar_a;
    }

    public int getAlmacen_full_a() {
        return almacen_full_a;
    }

    public void setAlmacen_full_a(int almacen_full_a) {
        this.almacen_full_a = almacen_full_a;
    }

}
