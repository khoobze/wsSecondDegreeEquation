/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_eq_simple;

import core.Calcule;
import io.Input;
import io.Out;
import java.util.ArrayList;

/**
 *
 * @author 21416491
 */
public class Sol_eq_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Input in=new Input();      
        ArrayList<Double> entre = in.readVariables();
        Calcule core =new Calcule();
        ArrayList<Double> resultat = core.resolve(entre);
        Out sortie =new Out();
        sortie.print(resultat);
        
    }
    
}
