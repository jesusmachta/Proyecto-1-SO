/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import Clases.Trabajadores;

/**
 *
 * @author andres
 */
public class Functions {
    
    public int Costo_pb(int cantidad_trabajadores){
        Trabajadores pb = new Trabajadores();
        int costo = pb.sueldo_pb * 48;
        return costo;
    }
    public int Costo_cpu(int cantidad_trabajadores){
        Trabajadores cpu = new Trabajadores();
        int costo = cpu.sueldo_cpu * 48;
        return costo;
    }
    public int Costo_mram(int cantidad_trabajadores){
        Trabajadores cpu = new Trabajadores();
        int costo = (cpu.sueldo_mram * 24)/3;
        return costo;
    }
    public int Costo_fa(int cantidad_trabajadores){
        Trabajadores fa = new Trabajadores();
        int costo = (fa.sueldo_fa * 24)/3;
        return costo;
    }
    public int Costo_tg(int cantidad_trabajadores){
        Trabajadores tg = new Trabajadores();
        int costo = tg.sueldo_tg * 72;
        return costo;
    }
    public int ensamblaje(int cantidad_trabajadores){
        Trabajadores ensamblaje = new Trabajadores();
        int costo = ensamblaje.sueldo_ensamblador * 48;
        return costo;
    }
    
    
    
    
}
