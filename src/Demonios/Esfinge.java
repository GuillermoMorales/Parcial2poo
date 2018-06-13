/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demonios;

/**
 *
 * @author Guille
 */
public class Esfinge implements Demonio{
    public int vida=200;

        //GETTERS
        public int getVida() 
        {
            return vida;
        }
        //SETTERS
        public void setVida(int vida) 
        {
            this.vida = vida;
        }
        
        
    @Override
    public void attack() {
        
    }

    @Override
    public void defend() {
        
    }

    @Override
    public int medidorvida(int puntos) {
        setVida(vida-puntos);
        return vida;
    }

    @Override
    public int fase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
