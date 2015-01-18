<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
  <script type="text/javascript">
    function resetForm(){
    	var form = document.forms.loginform;
    	form.uname.value = "";
    	form.uage.value = 18;
    	form.usex.value= "M";
    }
    function sendForm(){
    	return true;
    }
  </script>
</head>
<body>
  <form:form name="loginform" action="processlogin" method="post" modelAttribute="user" >
	<table>
	<tbody>
	  <tr>
	    <td>Name: </td>
	    <td><form:input type="text" id="uname" path="name" placeholder="" /></td>
	  </tr>
	  <tr>
	    <td>Age: </td>
	    <td><form:input type="number" id="uage" path="age" placeholder="18" /></td>
	  </tr>
	  <tr>
	    <td>Sex: </td>
	    <td>
	      <form:select id="usex" path="sex">
	        <form:option selected="selected" value="M">Male</form:option>
	        <form:option value="F">Female</form:option>
	        <form:option value="O">Other</form:option>
	      </form:select>
	    </td>
	  </tr>
	  <tr>
	    <td><button type="button" onclick="resetForm()">reset form</td>
	    <td><button type="submit" onclick="sendForm()">send this info</button></td>
	  </tr>
	</tbody>
	</table>
  </form:form>
</body>
</html>
