/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;
import java.util.Scanner;
/**
 *
 * @author Guille
 */
public class Menu {
    
    public int cont;
    public usuario u1;
    public usuario u2;
    public static Menu menu;

    public Menu() {
    }
    public Menu(int cont, usuario u1, usuario u2) {
        this.cont = cont;
        this.u1 = u1;
        this.u2 = u2;
    }
    
    //GETTERS
    public int getCont() {
        return cont;
    }
    public usuario getU1() {
        return u1;
    }
    public usuario getU2() {
        return u2;
    }
    public static Menu getMenu() {
        return menu;
    }
    
    //SETTERS
    public void setCont(int cont) {
        this.cont = cont;
    }
    public void setU1(usuario u1) {
        this.u1 = u1;
    }
    public void setU2(usuario u2) {
        this.u2 = u2;
    }
    public static void setMenu(Menu menu) {
        Menu.menu = menu;
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void comandosU()
    {
        int opc = 0;
        
        
    }
}
