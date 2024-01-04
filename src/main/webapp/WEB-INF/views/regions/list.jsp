<%@page import="java.util.List"%>
<%@page import="com.winter.app.regions.RegionDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<!DOCTYPE html>
<html>

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <c:import url="../temps/bootStrap_css.jsp"></c:import>
	
  </head>
  <body>
	<c:import url="../temps/header.jsp"></c:import>

	<h1>Regions List</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>NAME</th>
				
			</tr>
			
			
		</thead>
		<!--  for(int i = 0 ; i<;i++ -->
		<!--  for(타입명 변수명:배열명) -->
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.region_id}</td>
				<td><a href="./detail?region_id=${dto.region_id}">${pageScope.dto.region_name}</td>
			</tr>
		</c:forEach>
	
		<tbody>
		
		</tbody>
		
	</table>
    
    <a href="add"  type="button" class="btn btn-success">Add</a>
    
    <c:import url="../temps/bootStrap_js.jsp"></c:import>
	
	
</body>
</html>