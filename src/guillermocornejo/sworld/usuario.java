/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermocornejo.sworld;

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
    public int puntos,opc;
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
    public usuario(int puntos,int opc,HeadQuarters hq,NovenoCirculo nc,
            MonteOlimpo mo,ArrayList<Humano> monedaoro,ArrayList<Humano>
            monedaplata,ArrayList<Humano> monedacobre,ArrayList<Humano> monedaoro)
    {
        
    }
    
}
