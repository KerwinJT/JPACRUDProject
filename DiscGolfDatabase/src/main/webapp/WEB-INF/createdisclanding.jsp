<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Disc</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div class="fluid container">
		<form:form action="createDisc" method="POST" modelAttribute="disc">
		<table class="table table-striped">
			<thead class="thead thead-dark">
				<tr>
					<th>Category</th>
					<th>Input</th>
				</tr>
			</thead>

			<tr>
				<td>Manufacturer </td>
				<td><form:input path="manufacturer" value="New Manufacturer"/></td>
			</tr>
			<tr>
				<td>Disc Model:</td>
				<td><form:input path="discModel" value="New Disc Model" /></td>
			</tr>
			<tr>
				<td>Max Weight:</td>
				<td><form:input path="maxWeight" value="175" /></td>
			</tr>
			<tr>
				<td>Diameter (cm):</td>
				<td><form:input path="diameterCM" value="0" /></td>
				
			</tr>
			<tr>
				<td>Height (cm):</td>
				<td><form:input path="heightCM" value="0"/></td>
			</tr>
			<tr>
				<td>Rim Depth (cm):</td>
				<td><form:input path="rimDepthCM" value="0"/></td>
			</tr>
			<tr>
				<td>Inside Rim Diameter (cm)</td>
				<td><form:input path="insideRimDiameterCM" value="0"/></td>
			</tr>
			<tr>
				<td>Rim Thickness (cm)</td>
				<td><form:input path="rimThicknessCM" value="0"/></td>
			</tr>
			<tr>
				<td>Rim Depth Ratio (%)</td>
				<td><form:input path="rimDepthRatio" value="0"/></td>
			</tr>
			<tr>
				<td>Rim Configuration</td>
				<td><form:input path="rimConfiguration" value="0" /></td>
			</tr>
			<tr>
				<td>Certification Number (##-### or ##-##)</td>
				<td><form:input path="certificationNumber" value="00-00" /></td>
			</tr>
			<%-- <tr>
				<td>Approved Date (YYYY-MM-DD)</td>
				<td><form:input path="approvedDate" value="2020-01-01"/></td>
			</tr> --%>
			<tr>
				<td>Flexibility (kg)</td>
				<td><form:input path="flexibilityKG" value="0"/></td>
			</tr>
			<tr>
				<td>Disc Class</td>
				<td><form:input path="discClass" value="Disc Class Super"/></td>
			</tr>
			<tr>
				<td>Max Disc Weight (vintage)</td>
				<td><form:input path="maxDiscWeightGR" value="0"/></td>
			</tr>
			<tr>
                    <td colspan="2"><input type="submit" value="Create"></td>
                </tr> 
		</table>
		</form:form>
	</div>
</body>
</html>