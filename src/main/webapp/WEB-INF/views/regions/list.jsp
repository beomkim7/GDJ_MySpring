<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
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
	
	<div>
		<form class="row g-3" action="./list">
		  <div class="col-auto">
		  	<select name="kind" class="form-select" aria-label="Default select example">
			  <option class="a" value="kind1">Title</option>
			  <option class="a" value="kind2">Contents</option>
			  <option class="a" value="kind3">Writer</option>
			  <option class="a" value="kind4">Title+Contents+Writer</option>
			</select>
		  </div>		
		
		  <div class="col-auto">
		    <label for="search" class="visually-hidden">Search</label>
		    <input type="text" name="search" class="form-control" id="search">
		  </div>

		  <div class="col-auto">
		    <button type="submit" class="btn btn-primary mb-3">검색</button>
		  </div>
.		</form>
	</div>
	
	<table class="table table-hover">
		<thead>
			<tr>
				<th>NUM</th><th>NAME</th><th>CONTENTS</th><th>RATE</th><th>JUMSU</th>
			</tr>
		</thead>
		<!-- for(int i=0;i<;i++) -->
		<!-- for(타입명 변수명:배열명) -->
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.productNum}</td>
				<td><a href="./detail?region_id=${dto.productNum}">${pageScope.dto.productName}</a></td>
				<td>CONTENTS</td>
				<td>RATE</td>
				<td>JUMSU</td>
			</tr>
		</c:forEach>


		<tbody>
			
		</tbody>
		
	</table>
	
	<div>
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		  	<c:if test="${!pager.start}">
		    <li class="page-item">
		      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    </c:if>
		    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		    <li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
		    </c:forEach>
		   
		   <c:if test="${!pager.last}"> 
		    <li class="page-item">
		      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		    </c:if>
		  </ul>
		</nav>
	</div>
	

	
	<a href="add" class="btn btn-success">Add</a>
	
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
 	
</body>
</html>