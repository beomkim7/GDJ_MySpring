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
		<h1>Product List</h1>
		<table class="table table-striped table-hover">
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
				<c:forEach items="${requestScope.list }" var="item">
					<tr onclick="location.href = '/products/detail?id='+${ item.productNum}">
						<td>${ item.productNum}</td>
						<td>${ item.productName}</td>
						<td>${ item.productContents}</td>
						<td>${ item.productRate}</td>
						<td>${ item.productJumsu}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>