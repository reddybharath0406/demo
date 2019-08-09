<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="green"><h1>Bharath Bus Online Regervation</h1></font>
<form:form modelAttribute="UserSignupDetails" action="userupdate" method="put">
<table>
<tr>
<td>FirstName:</td>
<td><form:input path="firstname"/><font color="red"></font><form:errors path="firstname"/></font></td>
</tr>
<tr>
<td>LastName:</td>
<td><form:input path="lastname"/><font color="red"><form:errors path="lastname"/></font></td>
</tr>
<tr>
<td>Age:</td>
<td><form:input path="age"/><font color="red"><form:errors path="age"/></font></td>
</tr>
<tr>
<td>Gender:</td>
<td>Male<form:radiobutton path="gender" value="male"/>Female<form:radiobutton path="gender" value="female"/><font color="red"><form:errors path="gender"/></font></td>
</tr>
<tr>
<td>Mobile:</td>
<td><form:input path="mobile"/><font color="red"><form:errors path="mobile"/></font></td>
</tr>
<tr>
<td>State:</font></td>
<td><form:select path="state">
  <form:option value="">Select State</form:option>
  <form:options items="${states}" />
</form:select><font color="red"><form:errors path="state"/></td>
</tr>
<tr>
<td>Country:</font></td>
<td><form:select path="country">
<form:option value="">Select Country</form:option>
<form:options items="${countries}"/>
</form:select><font color="red"><form:errors path="country"/></td>
</tr>
</table>
<input type="submit" value="SignUp">
</form:form>
</body>
</html>