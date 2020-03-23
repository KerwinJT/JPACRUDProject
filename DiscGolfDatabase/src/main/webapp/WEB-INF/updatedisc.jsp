<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update ${disc.manufacturer } ${disc.discModel }</title>
</head>
<body>
<div class="fluid container">
		<form:form action="updatedInformation" method="POST" modelAttribute="disc">
		<table class="table table-striped">
			<thead class="thead thead-dark">
				<tr>
					<th>Category</th>
					<th>Input</th>
				</tr>
			</thead>
			<tr>
				<td>ID </td>
				<td>${disc.id}<form:hidden path="id"/></td>
			</tr> 
			<tr>
				<td>Manufacturer </td>
				<td><form:input path="manufacturer" value="${disc.manufacturer}"/></td>
			</tr>
			<tr>
				<td>Disc Model:</td>
				<td><form:input path="discModel" value="${disc.discModel}" /></td>
			</tr>
			<tr>
				<td>Max Weight:</td>
				<td><form:input path="maxWeight" value="${disc.maxWeight}" /></td>
			</tr>
			<tr>
				<td>Diameter (cm):</td>
				<td><form:input path="diameterCM" value="${disc.diameterCM }" /></td>
				
			</tr>
			<tr>
				<td>Height (cm):</td>
				<td><form:input path="heightCM" value="${disc.heightCM }"/></td>
			</tr>
			<tr>
				<td>Rim Depth (cm):</td>
				<td><form:input path="rimDepthCM" value="${disc.rimDepthCM }"/></td>
			</tr>
			<tr>
				<td>Inside Rim Diameter (cm)</td>
				<td><form:input path="insideRimDiameterCM" value="${disc.insideRimDiameterCM }"/></td>
			</tr>
			<tr>
				<td>Rim Thickness (cm)</td>
				<td><form:input path="rimThicknessCM" value="${disc.rimThicknessCM }"/></td>
			</tr>
			<tr>
				<td>Rim Depth Ratio (%)</td>
				<td><form:input path="rimDepthRatio" value="${disc.rimDepthRatio }"/></td>
			</tr>
			<tr>
				<td>Rim Configuration</td>
				<td><form:input path="rimConfiguration" value="${disc.rimConfiguration }" /></td>
			</tr>
			<tr>
				<td>Certification Number (##-### or ##-##)</td>
				<td><form:input path="certificationNumber" value="${disc.certificationNumber }" /></td>
			</tr>
			<%-- <tr>
				<td>Approved Date (YYYY-MM-DD)</td>
				<td><form:input path="approvedDate" value="2020-01-01"/></td>
			</tr> --%>
			<tr>
				<td>Flexibility (kg)</td>
				<td><form:input path="flexibilityKG" value="${disc.flexibilityKG }"/></td>
			</tr>
			<tr>
				<td>Disc Class</td>
				<td><form:input path="discClass" value="${disc.discClass }"/></td>
			</tr>
			<tr>
				<td>Max Disc Weight (vintage)</td>
				<td><form:input path="maxDiscWeightGR" value="${disc.maxDiscWeightGR }"/></td>
			</tr>
			<tr>
                    <td colspan="2"><input type="submit" value="Update"></td>
                </tr> 
		</table>
		</form:form>
	</div>

</body>
</html>