/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.ArrayList;

/**
 *
 * @author 21416491
 */
public class Out {

    public void print(ArrayList<Double> sol) {
        if (sol.size() > 0) {
            System.out.print("La solution: ");
            for (Double s : sol) {
                System.out.print(s+" ");
            }
        } else {
            System.out.print("Pas de solution");
        }

    }
}
