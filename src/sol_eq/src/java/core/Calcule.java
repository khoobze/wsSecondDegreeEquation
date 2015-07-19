/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author 21416491
 */
public class Calcule {
    double a,b,c;
    public double delta () {
        return b*b-4*a*c;
    }
    public ArrayList<Double> resolve(ArrayList<Double> var) {
        ArrayList<Double> resultat = new ArrayList<>();
        this.a = var.get(0);
        this.b = var.get(1);     
        this.c = var.get(2);
        double d = delta();
        if(d > 0) {
            resultat.add((-b+sqrt(d))/2*a);
            resultat.add((-b-sqrt(d))/2*a);
        } else if (d == 0) {
            resultat.add((-b)/2*a);
        }       
        return resultat;       
    }
    
}
