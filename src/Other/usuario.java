/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import Humanos.Humano;
import Humanos.HeadQuarters;
import Demonios.Demonio;
import Demonios.NovenoCirculo;
import Dioses.Dios;
import Dioses.MonteOlimpo;
import java.util.ArrayList;

/**
 *
 * @author Guille
 */
public class usuario {
    public int puntos;
    public String opc;
    //Declarando los edificios centrales de cada raza
    public HeadQuarters hq;
    public NovenoCirculo nc;
    public MonteOlimpo mo;
    //Declarando los recursos de cada raza
    
    //Humanos
    public ArrayList<Humano> monedaoro;
    public ArrayList<Humano> monedaplata;
    public ArrayList<Humano> monedacobre;
    //Dioses
    public ArrayList<Dios> plantacion;
    public ArrayList<Dios> moneda;
    public ArrayList<Dios> mena;
    //Demonios
    public ArrayList<Demonio> alma;
    public ArrayList<Demonio> pecado;
    public ArrayList<Demonio> monedajudas;
    
    public usuario(){
        
    }
    public usuario(int puntos,String opc,HeadQuarters hq,ArrayList<Humano> monedaoro,ArrayList<Humano>
            monedaplata,ArrayList<Humano> monedacobre)
    {
        this.opc = opc;
        this.hq = hq;
        this.monedaoro = monedaoro;
        this.monedaplata = monedaplata;
        this.monedacobre = monedacobre;
    }
    public usuario(int puntos,String opc,NovenoCirculo nc,ArrayList<Demonio> alma,
            ArrayList<Demonio>pecado,ArrayList<Demonio>monedajudas)
    {
        this.opc = opc;
        this.nc = nc;
        this.alma = alma;
        this.pecado = pecado;
        this.monedajudas = monedajudas;
    }
    public usuario(int puntos,String opc,MonteOlimpo mo,ArrayList<Dios> plantacion,
            ArrayList<Dios> moneda,ArrayList<Dios> mena)
    {
        this.opc = opc;
        this.mo = mo;
        this.plantacion = plantacion;
        this.moneda = moneda;
        this.mena = mena;
    }

   
    
    //GETTERS
    public int getPuntos() {
        return puntos;
    }
    public String getOpc() {
        return opc;
    }
    public HeadQuarters getHq() {
        return hq;
    }
    public NovenoCirculo getNc() {
        return nc;
    }
    public MonteOlimpo getMo() {
        return mo;
    }
    public ArrayList<Humano> getMonedaoro() {
        return monedaoro;
    }
    public ArrayList<Humano> getMonedaplata() {
        return monedaplata;
    }
    public ArrayList<Humano> getMonedacobre() {
        return monedacobre;
    }
    public ArrayList<Dios> getPlantacion() {
        return plantacion;
    }
    public ArrayList<Dios> getMoneda() {
        return moneda;
    }
    public ArrayList<Dios> getMena() {
        return mena;
    }
    public ArrayList<Demonio> getAlma() {
        return alma;
    }
    public ArrayList<Demonio> getPecado() {
        return pecado;
    }
    public ArrayList<Demonio> getMonedajudas() {
        return monedajudas;
    }    
    
    //SETTERS

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public void setOpc(String opc) {
        this.opc = opc;
    }
    public void setHq(HeadQuarters hq) {
        this.hq = hq;
    }
    public void setNc(NovenoCirculo nc) {
        this.nc = nc;
    }
    public void setMo(MonteOlimpo mo) {
        this.mo = mo;
    }
    public void setMonedaoro(ArrayList<Humano> monedaoro) {
        this.monedaoro = monedaoro;
    }
    public void setMonedaplata(ArrayList<Humano> monedaplata) {
        this.monedaplata = monedaplata;
    }
    public void setMonedacobre(ArrayList<Humano> monedacobre) {
        this.monedacobre = monedacobre;
    }
    public void setPlantacion(ArrayList<Dios> plantacion) {
        this.plantacion = plantacion;
    }
    public void setMoneda(ArrayList<Dios> moneda) {
        this.moneda = moneda;
    }
    public void setMena(ArrayList<Dios> mena) {
        this.mena = mena;
    }
    public void setAlma(ArrayList<Demonio> alma) {
        this.alma = alma;
    }
    public void setPecado(ArrayList<Demonio> pecado) {
        this.pecado = pecado;
    }
    public void setMonedajudas(ArrayList<Demonio> monedajudas) {
        this.monedajudas = monedajudas;
    }
    
}
