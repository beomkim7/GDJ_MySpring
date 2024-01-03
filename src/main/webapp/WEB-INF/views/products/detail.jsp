<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	<div class="container-sm">
		<h1>Product Detail</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>DESCRIPTION</th>
					<th>RATE</th>
					<th>SCORE</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${ dto.productNum}</td>
					<td>${ dto.productName}</td>
					<td>${ dto.productContents}</td>
					<td>${ dto.productRate}%</td>
					<td>${ dto.productJumsu}점</td>
				</tr>
			</tbody>
		</table>
	</div>
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>