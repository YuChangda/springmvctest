<%--
  Created by IntelliJ IDEA.
  User: wcd
  Date: 2017/5/6
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta content="text/html;charset=UTF-8" http-equiv="content-type">
    <title>Hello World</title>
</head>
<body>
    hello!
    ${requestScope.message}
</body>
</html>
