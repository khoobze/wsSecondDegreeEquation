<%-- 
    Document   : Quadsol
    Created on : 15 janv. 2015, 20:48:45
    Author     : mohammed
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="io.FormattingOutput"%>
<%@page import="java.util.ArrayList"%>
<%@page import="core.RequestHandler"%>
<%@page import="core.Calcule"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Résolutoin avec une page JSP</title>
    </head>
    <body>
        <%
            Calcule core = new Calcule();
            RequestHandler rh = new RequestHandler();
            ArrayList<Double> var = rh.extractVariables(request);
            ArrayList<Double> res = core.resolve(var);
            FormattingOutput fo = new FormattingOutput();
            request.setAttribute("response", fo.formatResultat(res));           
            request.getRequestDispatcher("sol_eq_jsp.jsp").include(request, response);         
        %>
    </body>
</html>
