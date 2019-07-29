<%-- 
    Document   : Delete
    Created on : Jul 28, 2019, 4:42:52 PM
    Author     : TryAg
--%>

<%@page import="com.java.DB.Student"%>
<%@page import="com.java.DB.StudentManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% 
        String i=request.getParameter("id");
        try{
            int id=Integer.parseInt(i);
            StudentManager sm=new StudentManager();
            Student s=new Student();
            s=sm.show(id);
        %>
    <body>
        <%@include file="header.html" %>
        <div class="container">
            <form action="ServletUpdate?id=<%= id%>" method="post" style="margin-top: 10px;">
  <div class="form-group">
    <label for="exampleInputEmail1">Họ tên</label>
    <input class="form-control" type="text" name="name" value="<%= s.getHoTen()%>">

  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Khoa</label>
    <input class="form-control" type="text" name="khoa" value="<%= s.getKhoa()%>">
  </div>
            <div class="form-group">
    <label for="exampleInputPassword1">Lớp</label>
    <input class="form-control" type="text" name="lop" value="<%= s.getLop()%>">
  </div>
 <% }catch(Exception e){
            e.printStackTrace();
        }
            
    %>
  <button type="submit" class="btn btn-primary">Sửa</button>
</form>
            </div>
    </body>
</html>
