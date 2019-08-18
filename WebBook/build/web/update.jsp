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
        
     <br>   
     <div class="container">
         <form action="edit" method="post">
             
             <div class="form-group">
      <label for="exampleFormControlSelect1">ID</label>
      <input class="form-control form-control-sm" type="text" name="id"  value="${book.id}" readonly="true">
  </div>
  <div class="form-group">
      <label for="exampleFormControlSelect1">Tên sách</label>
    <input class="form-control form-control-sm" type="text" name="title" value="${book.title}">
  </div>
         <div class="form-group">
      <label for="exampleFormControlSelect1">Tác giả</label>
      <input class="form-control form-control-sm" type="text" name="author" value="${book.author}" >
  </div>
         <div class="form-group">
      <label for="exampleFormControlSelect1">Giá</label>
      <input class="form-control form-control-sm" type="text" name="price" value="${book.price}" >
  </div>
         <div class="form-group">
      <label for="exampleFormControlSelect1">Số lượng</label>
      <input class="form-control form-control-sm" type="text" name="quantity" value="${book.quantity}">
  </div>
  <button type="submit" class="btn btn-primary" >Submit</button>
</form>
     </div>
    </body>
    
    
</html>
