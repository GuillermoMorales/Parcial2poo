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

/* LOS ANGELES SERAN LA MILICIA MAS FUERTE QUE LAS DEMAS RAZAS*/
public class Angeles implements Dios{
public int vida=200;
    
    public int getVida(){
        return vida;
    }
    public int setVida(int vida){
        return vida;
    }
    @Override
    public void attack() {
        System.out.println("Los angeles atacan con flechas divinas, hacen un daño"
                + "de 250 puntos");
        int poder = 250;
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
