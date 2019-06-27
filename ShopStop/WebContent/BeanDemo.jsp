<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="BeanId" class="beans.SimpleBean" scope="application"/>
<jsp:setProperty name="BeanId" property="name" value="an"/>
<jsp:setProperty name="BeanId" property="age" value="2"/>

</head>

<body>
name is:<jsp:getProperty name="BeanId" property="name"/><br>
age is:<jsp:getProperty name="BeanId" property="age"/><br>
</body>
</html>