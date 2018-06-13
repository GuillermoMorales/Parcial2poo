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
public class Mandamiento implements Demonio{
public int vida=300;
public int poder = 3000;
    public int getPoder()
    {
        return poder;
    }
    public int getVida(){
        return vida;
    }
    
    public int setPoder(int poder)
    {
        return poder;
    }
    public int setVida(int vida){
        return vida;
    }
    @Override
    public void attack() {
        System.out.println("El mandamiento lanza una maldición de Lucifer,"
                + "provoca un daño de 300 puntos");
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
