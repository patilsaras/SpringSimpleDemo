<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
 <center>
 <b>Student Registration Form </b> 
  <div>
   <form:form method="post" action="addstudent.html" >
    <table>
     <tr>
      <td>Stud id :</td>
      <td><form:input path="studId" /></td>
     </tr>
     <tr>
     <tr>
      <td>First Name :</td>
      <td><form:input path="firstName" /></td>
     </tr>
     <tr>
      <td>Last Name :</td>
      <td><form:input path="lastName" /></td>
     </tr>
     <tr>
      <td>Gender :</td>
      <td><form:radiobutton path="gender" value="male" label="Male"/>
      	  <form:radiobutton path="gender" value="female" label="Female"/>    
      </td>
     </tr>
     <tr>
      <td>City :</td>
      <td><form:input path="city"/>
      
      </td>
     </tr>
     <tr>
      
      <td colspan="2"><input type="submit" value="Save" /></td>
     </tr>
     
    </table>
   </form:form>
  </div>
 </center>
</body>
</html>