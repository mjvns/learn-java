<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07-06-2018
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page.jsp</title>
</head>
<body>
<h4>Corresponding are the details entered by the user:</h4>
<%
    String firstName = request.getParameter("firstname");
    String lastName = request.getParameter("lastname");
    String gender = request.getParameter("gender");
    String car = request.getParameter("cars");
    String message = request.getParameter("message");
    out.print("The first Name is: <br>"+firstName+"<br>Last Name is: <br>"+lastName+"<br>Gender is: <br>"+gender+"<br>Description: <br>"+message);
    out.println(request.getAttribute("Madhukar"));
%>
</body>
</html>
