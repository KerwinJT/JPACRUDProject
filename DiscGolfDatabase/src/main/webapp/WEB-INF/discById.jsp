<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${disc.manufacturer }${disc.discModel }</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<a href="home.do"> Home </a>
		<form action="deleteDisc.do?discId=${disc.id}" method="POST">
			<input type="submit" 
				value="Delete: ${disc.discModel}"/>
		</form>
	</div>
	<div class="fluid containter">
		<table class="table table-striped">
			<thead class="thead thead-dark">
				<tr>
					<th>Category</th>
					<th>Information</th>
				</tr>
			</thead>
			<tr>
				<td><strong>Manufacturer</strong></td>
				<td>${disc.manufacturer }</td>
			</tr>
			<tr>
				<td><strong>Disc Model</strong></td>
				<td>${disc.discModel }</td>
			</tr>
			<tr>
				<td><strong>Max Weight</strong></td>
				<td>${disc.maxWeight}</td>
			</tr>
			<tr>
				<td><strong>Diameter (CM)</strong></td>
				<td><c:out value="${disc.diameterCM}" /></td>
			</tr>
			<tr>
				<td><strong>Height (CM)</strong></td>
				<td><c:out value="${disc.heightCM}" /></td>
			</tr>
			<tr>
				<td><strong>Rim Depth (CM)</strong></td>
				<td><c:out value="${disc.rimDepthCM}" /></td>
			</tr>
			<tr>
				<td><strong>Inside Rim Diameter (CM)</strong></td>
				<td><c:out value="${disc.insideRimDiameterCM}" /></td>
			</tr>
			<tr>
				<td><strong>Rim Thickness (CM)</strong></td>
				<td><c:out value="${disc.rimThicknessCM}" /></td>
			</tr>
			<tr>
				<td><strong>Rim Depth Ratio (%)</strong></td>
				<td><c:out value="${disc.rimDepthRatio}%" /></td>
			</tr>
			<tr>
				<td><strong>Rim Configuration</strong></td>
				<td><c:out value="${disc.rimConfiguration}" /></td>
			</tr>
			<tr>
				<td><strong>Certification Number</strong></td>
				<td><c:out value="${disc.certificationNumber}" /></td>
			</tr>
			<tr>
				<td><strong>Approved Date</strong></td>
				<td>${disc.approvedDate}</td>
			</tr>
			<tr>
				<td><strong>Flexibility (kg)</strong></td>
				<td><c:out value="${disc.flexibilityKG}" /></td>
			</tr>
			<tr>
				<td><strong>Disc Class</strong></td>
				<td><c:out value="${disc.discClass}" /></td>
			</tr>
			<tr>
				<td><strong>Max Disc Weight (gr)</strong></td>
				<td><c:out value="${disc.maxDiscWeightGR}" /></td>
			</tr>
		</table>

	</div>

</body>
</html>