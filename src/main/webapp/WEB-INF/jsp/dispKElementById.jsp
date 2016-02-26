<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of KElements</title>
</head>
<center><h1>List of Knowledge Elements</h1></center>
<body>
	<table border="1" align="center" style="width: 50%">
		<thead>
			<tr>
				<th>KElement Id</th>
				<th>KElement Name</th>
				<th>KElement Description</th>
				<th>KElement CreatedBy</th>
				<th>KElement CreatedDate</th>
				<th>KElement UpdatedBy</th>
				<th>KElement UpdatedDate</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="kElements" items="${kElements}">
                <tr>
					<td>${kElements.kElementId}</td>
					<td>${kElements.kElementName}</td>
					<td>${kElements.kElementDescription}</td>
					<td>${kElements.kElementCreatedBy}</td>
					<td>${kElements.kElementCreatedDate}</td>
					<td>${kElements.kElementUpdatedBy}</td>
					<td>${kElements.kElementUpdatedDate}</td>
				</tr>
            </c:forEach>
		</tbody>
	</table>
</body>
</html>