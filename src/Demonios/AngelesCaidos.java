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
public class AngelesCaidos implements Demonio{
public int vida=230;
public int poder = 250;

    //GETTERS
    public int getPoder()
    {
        return poder;
    }
    public int getVida(){
        return vida;
    }
    
    //SETTERS
    public int setPoder(int poder)
    {
        return poder;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void attack() {
        System.out.println("Los angeles caidos tiran 150 flechas oscuras,"
                + "provocan un daño de 250 puntos");
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
