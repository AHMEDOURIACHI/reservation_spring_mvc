<%-- 
    Document   : _TEMPLATE
    Created on : 29 mai 2017, 14:28:52
    Author     : formation
--%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="chemin">
    <spring:url value="/hotel/modifier"/>
</c:set>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="../_MENU.jsp"></c:import>
               <contenu>
               <form:form modelAttribute="hotel" action="/hotel/ajouter">
               <form:hidden path="id"/>
               <label> Nom Hotel :</label>
               <form:input path="nom"></form:input>
               <label> Rue </label>
               <form:input path="adresse.rue"></form:input>
               <label> Pays </label>
               <form:input path="adresse.pays"></form:input>
               <input type="submit">
               </form:form>
        
               </contenu>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>
