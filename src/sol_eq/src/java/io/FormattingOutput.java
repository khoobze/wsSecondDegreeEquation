/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author mohammed
 */
public class FormattingOutput {

    public String formatResultat(ArrayList<Double> res) {
        String data = "";
        if (res.size() <= 0) {
            data += "<p> Pas de solution </p>";
        } else {
            int i=1;
            data+="<p>La solution de l'equation </p>";
            data+="<p>";
            for (Double r : res) {
                
                DecimalFormat df = new DecimalFormat("0.00");
                data += "X"+i+"="+ df.format(r) + "&nbsp;&nbsp;&nbsp;&nbsp;";
                i++;
            }
            data+="</p>";
        }
        data += "";
        return data;
    }
}
