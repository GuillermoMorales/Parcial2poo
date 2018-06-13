/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demonios;
import guillermocornejo.sworld.AbstractFactory;
import Humanos.Humano;
import Dioses.Dios;
/**
 *
 * @author Guille
 */
public class FactoryDemonios implements AbstractFactory{

    public Dios getDioses(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Demonio getDemonio(String type) {
        switch(type){
            case "angelescaidos":
                    return new AngelesCaidos();
                case "mandamiento":
                    return new Mandamiento();
        }
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
