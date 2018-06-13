/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermocornejo.sworld;

import Demonios.Demonio;
import Dioses.Dios;
import Humanos.Humano;

/**
 *
 * @author Guille
 */
public interface AbstractFactory {
    Dios getDios(String type);
    Demonio getDemonio(String type);
    Humano getHumano(String type);
}
