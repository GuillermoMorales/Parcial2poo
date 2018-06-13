/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dioses;

import Humanos.Humano;
import Demonios.Demonio;
import guillermocornejo.sworld.AbstractFactory;
/**
 *
 * @author Guille
 */
public class FactoryDioses implements AbstractFactory{

    public Dios getDioses(String type) {
        switch(type){
            case "arcangel":
                    return new Arcangel();
                case "angeles":
                    return new Angeles();
        }
        return null;       
    }

    @Override
    public Demonio getDemonio(String type) {
        return null;
    }

    @Override
    public Humano getHumano(String type) {
        return null;
    }

    @Override
    public Dios getDios(String type) {
        return null;
        
    
}
     
}
