<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Disc Golf Discs</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
<h1>Search all approved PDGA Discs</h1>
<div class="fluid container">
		<!-- <form action="getFilm.do" method="GET" class="form">
			Film ID: <input type="text" name="fid" class = "form-control"/> 
			<input type="submit" value="Show Film" class = "form-control"/>
		</form> -->
		<table class="table table-striped">
			<thead class="thead thead-dark">
				<tr>
					<th>Disc Model</th>
					<th>Manufacturer</th>
				</tr>
			</thead>
			<c:forEach var="disc" items="${discs }">
				<tr>
					<td><a href=getDisc.do?did=${disc.id}>${disc.discModel }</a></td>
					<td>${disc.manufacturer}</td>
				</tr>
			</c:forEach>
		</table>
		<!-- TODO: List all films as links to getFilm.do?fid=${film.id} -->
	</div>

</body>
</html>