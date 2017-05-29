<%-- 
    Document   : _TEMPLATE
    Created on : 29 mai 2017, 14:28:52
    Author     : formation
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="../_MENU.jsp"></c:import>
    <contenu>
               <table>
              <tr>
                  <td> Nom  </td>
                  <td> Rue </td>
                  <td> localite</td>
      
              </tr>
              
              <c:forEach items="${listeHotels}" var="h">
              <tr> 
                <td> ${h.nom} </td>
               
               
              </tr>
              </c:forEach>
            
        </table>
    </contenu>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>
