<%-- 
    Document   : AddStudent
    Created on : Jul 28, 2019, 9:46:34 PM
    Author     : TryAg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new Student</title>
    </head>
    <body>
        <%@include file="header.html" %>
        <div class="container">
            <form action="ServletAdd" method="post" style="margin-top: 10px;">
  <div class="form-group">
    <label for="exampleInputEmail1">Họ tên</label>
    <input class="form-control" type="text" name="name">

  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Khoa</label>
    <input class="form-control" type="text" name="khoa">
  </div>
            <div class="form-group">
    <label for="exampleInputPassword1">Lớp</label>
    <input class="form-control" type="text" name="lop">
  </div>
  
  <button type="submit" class="btn btn-primary">Thêm</button>
</form>
            </div>
    </body>
</html>
