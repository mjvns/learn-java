<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 02-06-2018
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String firstName = request.getParameter("firstname");
    String lastName = request.getParameter("lastname");
    String gender = request.getParameter("gender");
    String car = request.getParameter("cars");
    String message = request.getParameter("message");

    out.print("The first Name is: <br>"+firstName+"<br>Last Name is: <br>"+lastName+"<br>Gender is: <br>"+gender+"<br>Description: <br>"+message);
%>
