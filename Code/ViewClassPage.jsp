<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Class</title>
</head>
<body>
 
<div style="text-align:centre">

<h1 style="Color:blue">Learner's Academy</h1><b style="Color:blue">Class Page</b>
<table  style="text-align:center; margin-left:auto;">
<tr><td>&nbsp;&nbsp;<a href="logout">logout</a>&nbsp;&nbsp;</td></tr>
<tr><td>&nbsp;&nbsp;<a href="/SchoolManagmentSystem/Dashboard.jsp">Dashboard</a>&nbsp;&nbsp;</td></tr>
</table>
<br/>

<div style="color:red;text-align: center; border: 1px outset red;
  background-color: lightblue;" >

</div>
<br/>
<center><b>Class Details</b></center>
<br/>

<br/>
<br/>
<form action="UpdateClass" method="post">
<table border="1" style="text-align:center; margin-left:auto;margin-right:auto;">
<tr>
<td>Standard </td><td><input type="number" name="standard" min="0" placeholder="standard"></td>
</tr>
<tr>
<td>Division </td><td><input type="text" name="division" placeholder="division"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="add" value="ADD CLASS"></td>
</tr>
</table>
</form>
</div>
<%@include file='footer.html' %>
</body>
</html>