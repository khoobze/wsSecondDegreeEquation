<%-- 
    Document   : index
    Created on : 9 janv. 2015, 11:30:34
    Author     : 21416491
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css"  />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Résolution avec un Servlet</title>
    </head>
    <body>
        <div id="wraper">
            <div id="auth_form">
                <h2>Equation quadratique</h2>
                <form action="requestHandler" method="GET">
                       <table>
                    <tr>
                        
                        <td>
                            <input type="number" step="any"  name="val_a"/>
                        </td>               
                        <td>X&sup2;+</td>
                        <td>
                            <input type="number" step="any" name="val_b"/>
                        </td>
                        <td>X+</td>
                        <td>
                            <input type="number" step="any" name="val_c"/>
                        </td>
                        <td>=0</td>
                    </tr>
                    <tr>
                        <td colspan="6">
                            <input type="submit"  value="Résoudre"/>
                        </td>
                    </tr>
                </table>
                </form>
                <div class="result">
                <%
                    if (request.getAttribute("response") != null) {
                        out.print(request.getAttribute("response"));
                    }
                %>
            </div>
            </div>
            
        </div>
    </body>
</html>
