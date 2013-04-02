<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fast Track Travels</title>
</head>
<body>

<c:if test="${!empty bookingList}">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${bookingList}" var="book">
<tr>
<td>
${book.routeid}
</td>
</tr>
</c:forEach>
</c:if>
</body>
</html>