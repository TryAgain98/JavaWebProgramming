<%-- 
    Document   : Registration
    Created on : Aug 28, 2019, 7:21:50 PM
    Author     : Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="https://getbootstrap.com/docs/4.0/assets/img/favicons/favicon.ico">

        <title>Album example for Bootstrap</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/album/">
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
        <!-- Bootstrap core CSS -->
        <link href="./Album example for Bootstrap_files/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="./Album example for Bootstrap_files/album.css" rel="stylesheet">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <script>
            function check(){
                 var name = document.forms["myForm"]["name"].value;
                 var  phone= document.forms["myForm"]["phone"].value;
                 var  email= document.forms["myForm"]["email"].value;
                 var  password= document.forms["myForm"]["password"].value;
                 var  sex= document.forms["myForm"]["sex"].value;
                  var  day= document.forms["myForm"]["day"].value;
                   var  month= document.forms["myForm"]["month"].value;
                    var  year= document.forms["myForm"]["year"].value;
                if(name==null){
                    alert("ngu");
                        return false;
                }
            }
            
        </script>
    </head>
    <body>
        <%@include file="head.jsp" %>
        <div class="container"  >
            <center>  <div style="width: 57%; height: 100%; padding-bottom: 40px; background: #f2f2f2;">
                    <center><h4>Tạo tài khoản</h4></center>
                    <spring:form action="addAccount" modelAttribute="c" onsubmit="return check()" name="myForm">
                        <div class="form-group row">
                            <div class="col-sm-3" >Họ tên  </div>
                            <div class="col-sm-9" > <input type="text" path="name" name="name" class="form-control" id="formGroupExampleInput" placeholder="Nhập họ tên"></div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3 float-left">SĐT  </div>
                            <div class="col-sm-9" > <input type="text" path="phone" name="phone" class="form-control" id="formGroupExampleInput" placeholder="Nhập số điện thoại"></div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3" >Email  </div>
                            <div class="col-sm-9" > <input type="email" path="email" name="email" class="form-control" id="formGroupExampleInput" placeholder="Nhập email"></div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3" >Mật khẩu  </div>
                            <div class="col-sm-9" > <input type="password" path="password" name="password" class="form-control" id="formGroupExampleInput" placeholder="Nhập mật khẩu"></div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-3" >Giới tính  </div>
                            <div class="form-check " style="margin-left: 15px;">
                                <input class="form-check-input"  type="radio" path="sex" name="sex" id="exampleRadios1" value="option1" checked="" >Nam
                            </div>
                            <div class="form-check " style="margin-left: 100px;">
                                <input class="form-check-input" type="radio" path="sex" name="sex" id="exampleRadios2" value="option2" >Nữ
                            </div> 
                        </div>

                        <div class="form-group row" >
                            <div class="col-sm-3" >Ngày sinh  </div>
                            <div class="col-sm-3" > <select name="day" path="day" name="dropdown" class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                    <option selected>Ngày</option>
                                    <c:forEach var="item" items="${lday}">
                                        <option value="${item}">${item}</option>
                                    </c:forEach>
                                </select></div>
                            <div class="col-sm-3" > <select name="month" path="month" name="dropdown" class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                    <option selected>Tháng</option>
                                    <c:forEach var="item" items="${lmonth}">
                                        <option value="${item}">${item}</option>
                                    </c:forEach>
                                </select></div>
                            <div class="col-sm-3" > <select name="year" path="year" name="dropdown" class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                    <option selected>Năm</option>
                                    <c:forEach var="item" items="${lyear}">
                                        <option value="${item}">${item}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <button type="submit" style="width: 50%;margin-top: 30px;padding: 10px 10px;" class="btn btn-primary btn-sm">Đăng ký</button>
                    </spring:form>
            </center>
        </div>
    </div>
</body>
</html>
