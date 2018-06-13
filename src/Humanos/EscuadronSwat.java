/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

/**
 *
 * @author Guille
 */
public class EscuadronSwat implements Humano{
public int vida=250;
 public int poder = 300;
    
    public int getPoder()
    {
        return poder;
    }
    
    public int getVida(){
        return vida;
    }
    public int setVida(int vida){
        return vida;
    }
    public int setPoder(int poder)
    {
        return poder;
    }

    @Override
    public void attack() {
        System.out.println("El escuadron swat lanza una ráfaga de balas"
                + "de plata, proporcionan un daño de 270 puntos");
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
