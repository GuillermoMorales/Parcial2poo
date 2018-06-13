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
public interface Demonio {
    //Ataque
    void attack();
    //Defensa
    void defend();
    //Recibir daños a la vida
    int medidorvida(int puntos);
    //Se guarda la fase en la que fue creado el objeto
    int fase();
    
}
