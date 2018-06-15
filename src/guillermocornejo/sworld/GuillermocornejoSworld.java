/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermocornejo.sworld;

import Humanos.Humano;
import Demonios.Demonio;
import Demonios.NovenoCirculo;
import Dioses.Dios;
import Dioses.MonteOlimpo;
import Humanos.HeadQuarters;
import java.util.Scanner;
import Other.Menu;
import Other.usuario;
import java.util.ArrayList;
/**
 *
 * @author Guille
 */
public class GuillermocornejoSworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //Humanos
        HeadQuarters hq=new HeadQuarters();
        HeadQuarters hq2=new HeadQuarters();
        ArrayList<Humano> moro=new ArrayList<Humano>();
        ArrayList<Humano> moro2=new ArrayList<Humano>();
        ArrayList<Humano> mopla=new ArrayList<Humano>();
        ArrayList<Humano> mopla2=new ArrayList<Humano>();
        ArrayList<Humano> moco=new ArrayList<Humano>();
        ArrayList<Humano> moco2=new ArrayList<Humano>();
        //Demonios
        NovenoCirculo nc = new NovenoCirculo();
        NovenoCirculo nc2 = new NovenoCirculo();
        ArrayList<Demonio> alma=new ArrayList<Demonio>();
        ArrayList<Demonio> alma2=new ArrayList<Demonio>();
        ArrayList<Demonio> pecado=new ArrayList<Demonio>();
        ArrayList<Demonio> pecado2=new ArrayList<Demonio>();
        ArrayList<Demonio> monjudas=new ArrayList<Demonio>();
        ArrayList<Demonio> monjudas2=new ArrayList<Demonio>();
        //Dioses
        MonteOlimpo mo = new MonteOlimpo();
        MonteOlimpo mo2 = new MonteOlimpo();
        ArrayList<Dios> plan=new ArrayList<Dios>();
        ArrayList<Dios> plan2=new ArrayList<Dios>();
        ArrayList<Dios> moneda=new ArrayList<Dios>();
        ArrayList<Dios> moneda2=new ArrayList<Dios>();
        ArrayList<Dios> mena=new ArrayList<Dios>();
        ArrayList<Dios> mena2=new ArrayList<Dios>();
        //Variables
        Scanner entrada = new Scanner(System.in);
        String num;
        boolean flag = false;
        boolean demonios = false;
        int cont=1;
        ///////////////////////////////////////////////////////////////////////
        System.out.println("--------------------BIENVENIDO AL JUEGO--------------------");
        System.out.println("Razas disponibles:\n"
                + "1)Demonios\n"
                + "2)Humanos\n"
                + "3)Dioses\n");
        do
        {
            System.out.println("Jugador 1 seleccione su raza: ");
            num= entrada.nextLine();
            if (num.matches("[1-3]")) 
            {
                flag=true;
                int numero = Integer.parseInt(num);
                switch (numero) {
                    case 1:
                        {
                            System.out.println("Has seleccionado la raza Demonios");
                            System.out.println("");
                            demonios = true;
                            
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Has seleccionado la raza Humanos");
                            System.out.println("");
                            usuario u1 = new usuario(1 , num, hq,moro,mopla,moco);
                            break;
                        }
                    case 3:
                        {
                            System.out.println("Has seleccionado la raza Dioses");
                            System.out.println("");
                            usuario u1 = new usuario(1 , num, mo,plan,moneda,mena);
                            break;
                        }
                    default:
                        break;
                }
                
            } 
            else 
            {
                flag=false;
                System.out.println("Dato inválido, vuelva a intentar");
                System.out.println("Razas disponibles:\n"
                + "1)Demonios\n"
                + "2)Dioses\n"
                + "3)Humanos\n");
            }
        }while(flag==false);
        if(demonios == true)
        {
            usuario u1=new usuario( 1 , num, nc,alma,pecado,monjudas);
        }
        //////////////////////////////////////////////////////////////////////
        //Jugador 2
        do
        {
            System.out.println("Jugador 2 seleccione su raza: ");
            num= entrada.nextLine();
            if (num.matches("[1-3]")) 
            {
                flag=true;
                int numero = Integer.parseInt(num);
                switch (numero) {
                    case 1:
                        {
                            System.out.println("Has seleccionado la raza Demonios");
                            System.out.println("");
                            usuario u2=new usuario( 2 , num, nc2,alma2,pecado2,monjudas2);
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Has seleccionado la raza Humanos");
                            System.out.println("");
                            usuario u2 = new usuario(2 , num, hq2,moro2,mopla2,moco2);
                            break;
                        }
                    case 3:
                        {
                            System.out.println("Has seleccionado la raza Dioses");
                            System.out.println("");
                            usuario u2 = new usuario( 2, num, mo2,plan2,moneda2,mena2);
                            break;
                        }
                    default:
                        break;
                }
                
            } 
            else 
            {
                flag=false;
                System.out.println("Dato inválido, vuelva a intentar");
                System.out.println("Razas disponibles:\n"
                + "1)Demonios\n"
                + "2)Dioses\n"
                + "3)Humanos\n");
            }
        }while(flag==false);
        
    }
}