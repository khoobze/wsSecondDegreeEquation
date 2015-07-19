/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 21416491
 */
public class Input {
    public ArrayList<Double> readVariables() {
        ArrayList<Double> variables=new ArrayList<Double>();
        System.out.print("a= ");
        variables.add(readDoubleVariable());
        System.out.println();
        System.out.print("b= ");
        variables.add(readDoubleVariable());
        System.out.println();
        System.out.print("c= ");
        variables.add(readDoubleVariable());
        System.out.println();
        return variables;
    }
    public double readDoubleVariable() {
        double r = 0;
        try {       
             String s="";
            
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    s = bufferRead.readLine();
            r = Double.parseDouble(s);
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
}
