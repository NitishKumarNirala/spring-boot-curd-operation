<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Customer Details</title>
</head>
<body>
<h2>Customer Details</h2>
<table width="50%">
	<tr>
		<th>Customer Reference</th>
		<th>Customer Address</th>
		<th>Customer PinCode</th>
		<th>Customer Remark</th>
	</tr>
	<c:forEach items="${list}" var="list" varStatus="status">
		<tr>
			<td>${list.cusRefNo}</td>
			<td>${list.cusAddress}</td>
			<td>${list.pinCode}</td>
			<td>${list.cusRemarks}</td>
			
		</tr>
	</c:forEach>
</table>	
<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>