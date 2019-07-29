<%-- 
    Document   : Student
    Created on : Jul 28, 2019, 3:24:56 PM
    Author     : TryAg
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.java.DB.Student"%>
<%@page import="com.java.DB.StudentManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title> Student</title>
    </head>
    <body>
        <div>
        
            <%@include file="header.html" %>
        <div class="container">
        
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Họ tên</th>
      <th scope="col">Khoa</th>
      <th scope="col">Lớp</th>
      <th scope="col">Chức năng</th>
    </tr>
  </thead>
  <tbody>
   
        <% 
            
            StudentManager sm=new StudentManager();
            List<Student> l=new ArrayList<Student>();
            l=sm.show();
           for(Student s:l){
               
           
                    
            
           %>
            <tr>
      <th scope="row"><%= s.getId()   %></th>
      
       <td> <%= s.getHoTen()%></td>
        <td> <%= s.getKhoa()%></td>
         <td> <%= s.getLop()%></td>
         <td> 
             <a href="Update.jsp?&id=<%= s.getId()%> " class="btn btn-primary" >Sửa</a>
             <a href="Delete?id=<%= s.getId()%> " class="btn btn-danger">Xóa</a>
         </td>
   
    </tr>
    <% } 
   
    %>
   
  </tbody>
</table>
    <a href="AddStudent.jsp" class="btn btn-success">Thêm mới</a>
        </div>
</div>
    </body>
</html>
