/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import Demonios.Demonio;
import Dioses.Dios;
import guillermocornejo.sworld.AbstractFactory;
/**
 *
 * @author Guille
 */
public class FactoryHumanos implements AbstractFactory{
    
    @Override
    public Dios getDios(String type) {
        return null;
    }

    @Override
    public Demonio getDemonio(String type) {
        return null;
    }

    @Override
    public Humano getHumano(String type) {
        switch(type){
            case "soldadouniversal":
                    return new SoldadUniversal();
                case "escuadronswat":
                    return new EscuadronSwat();
                
        }
        return null;
    }

    
    
}
