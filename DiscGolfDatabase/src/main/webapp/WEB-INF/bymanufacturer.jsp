<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Discs By Manufacturer</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div class="fluid container">
		<a href="home.do">Home</a>
		<!-- <form action="getFilm.do" method="GET" class="form">
			Film ID: <input type="text" name="fid" class = "form-control"/> 
			<input type="submit" value="Show Film" class = "form-control"/>
		</form> -->
		<table class="table table-striped">
			<thead class="thead thead-dark">
				<tr>
					<th>Manufacturer</th>
					<th>Disc Model</th>
				</tr>
			</thead>
			<c:forEach var="disc" items="${discs }">
				<tr>
					<td>${disc.manufacturer}</td>
					<td><a href=singleId.do?discId=${disc.id} method="POST">${disc.discModel }</a></td>
				</tr>
			</c:forEach>
		</table>
		<!-- TODO: List all films as links to getFilm.do?fid=${film.id} -->
	</div>
</body>
</html>