<%-- 
    Document   : newjsp
    Created on : Aug 18, 2019, 3:26:34 PM
    Author     : Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Book</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
     
      
    </ul>
    
  </div>
</nav>
    </body>
    <br>
    <div class="container">
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Tên Sách </th>
      <th scope="col">Tác giả</th>
      <th scope="col">Giá</th>
      <th scope="col">Số Lượng</th>
      <th scope="col">Chức năng</th>
    </tr>
  </thead>
  <tbody>
     
      <c:forEach var="item" items="${ListBook}"  >
    <tr>
      <th scope="row">${item.id}</th>
      <td>${item.title}</td>
      <td>${item.author}</td>
      <td>${item.price}</td>
       <td>${item.quantity}</td>
       <td> <a class="btn btn-primary" href="update?&id=${item.id}">Sửa</a>
                            <a class="btn btn-danger" href="delete?id=${item.id}">Xóa</a></td>
    </tr>
      </c:forEach>
  </tbody>
</table>
        <a href="Add.jsp" class="btn btn-success">Thêm mới</a>


    </div>
</html>
