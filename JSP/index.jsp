<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 02-06-2018
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="welcome.jsp" method="get">
        <fieldset>
            <legend>Personal Information:</legend>
                    Enter FirstName: <br><input type="text" name="firstname"><br>
                    Enter LastName: <br><input type="text" name="lastname"><br>
                    Enter Gender:<br>
                                    <input type="radio" name="gender" value="Male">Male<br>
                                    <input type="radio" name="gender" value="Female">Female<br>
                    Select Car Names: <br>
                    <select name="cars">
                        <option value="volvo">Volvo</option>
                        <option value="saab">Saab</option>
                        <option value="fiat">Fiat</option>
                        <option value="audi">Audi</option>
                    </select><br>

                    Tell us about Yourself: <textarea name="message" rows="10" cols="30"></textarea>
        </fieldset>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
