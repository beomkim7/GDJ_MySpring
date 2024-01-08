<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
   <c:import url="../temps/bootStrap_css.jsp"></c:import>
  </head>
  
<body>

	<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
 		 <div class="container-fluid">
   		 <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    	  <span class="navbar-toggler-icon"></span>
  	  </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/regions/list">regions</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/departments/list">departments</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown link
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>	
	</header>
	
	<section id="contents" class = "container-fluid">
		<div class = "row mt-4" >
			<form action = "update" method = "post">
				<input type="hidden" name="region_id" value="${dto.region_id}">
			  <div class="mb-3">
			    <label for="regionName" class="form-label">regionName</label>
			    <input type="text" name="region_name" value="${dto.region_name}" class="form-control" id="regionName">
			  </div>			  
			  <button type="submit" class="btn btn-primary">Add</button>
			</form>			
		</div>	
	</section>


</body>
</html>