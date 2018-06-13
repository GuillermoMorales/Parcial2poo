/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dioses;

/**
 *
 * @author Guille
 */
public class MonteOlimpo {
     public int vida=600;
     public int plantacion=10000;
     public int moneda=5000;
     public int mena=3000;
   

     
     //GETTERS
        public int getPlantacione() 
        {
            return plantacion;
        }
        public int getMoneda()
        {
            return moneda;
        }
        public int getMena() 
        {
            return mena;
        }public int getVida() 
        {
            return vida;
        }
    //SETTERS
        public void setPlantacion(int plantacion) 
        {
            this.plantacion = plantacion;
        }
        public void setMoneda(int moneda) 
        {
            this.moneda = moneda;
        }
        public void setMena(int mena)   
        {
            this.mena = mena;
        }   
        public void setVida(int vida)   
        {
            this.vida = vida;
        }
    
}
