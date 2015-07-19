/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mohammed
 */
public class RequestHandler {
    public  ArrayList <Double> extractVariables(HttpServletRequest request) throws NumberFormatException, NullPointerException {
        ArrayList <Double> var = new ArrayList<>();      
        var.add(Double.parseDouble(request.getParameter("val_a")));
        var.add(Double.parseDouble(request.getParameter("val_b")));
        var.add(Double.parseDouble(request.getParameter("val_c")));
        return var;
       
        
    }
}
