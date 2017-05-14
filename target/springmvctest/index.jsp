<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<h2>Hello World!</h2>
<form action="/springmvctest/user" method="post">
    ID: <input type="text" name="id"><br>
    name: <input type="text" name="name"><br>
    password: <input type="text" name="password"><br>
    <input type="submit" value="submit">
</form>

</body>
</html>
