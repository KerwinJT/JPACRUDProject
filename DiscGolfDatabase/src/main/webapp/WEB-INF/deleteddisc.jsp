<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleted Disc Response</title>
</head>
<body>
	<h2>

		<c:choose>
			<c:when test="${booleanDestroyed}">
				Successfully Destroyed
	</c:when>
			<c:otherwise>
				No disc was destroyed. This could be because it did not exist or you refreshed the page.
	</c:otherwise>
		</c:choose>
	</h2>
</body>
</html>