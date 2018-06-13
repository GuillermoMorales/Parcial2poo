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
public class Arcangel implements Dios{
public int vida=300;
    
    public int getVida(){
        return vida;
    }
    public int setVida(int vida){
        return vida;
    }
    @Override
    public void attack() {
        System.out.println("El Arcangel ataca con una supernova,provoca un daño "
                + "de 350 puntos");
        int poder = 350;
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
