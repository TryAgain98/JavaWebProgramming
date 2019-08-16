<%-- 
    Document   : index
    Created on : Aug 16, 2019, 3:45:57 PM
    Author     : Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Tin Nhanh</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="http://localhost:8080/TinNhanh/News">Tin nhanh</a>



        </nav>
        <div class="container" style="margin-top: 20px; ">
            <form method="post" action="News">
                <div class="form-group">
                    <label for="exampleInputEmail1">Search</label>
                    <input type="text" name="title" class="form-control" id="exampleInputEmail1"  placeholder="Enter title">

                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <br>
            <c:forEach var="item" items="${news}">
                <div class="card" style="width: 100%;">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">${item.content}</h6>
                        <p class="card-text">${item.author}</p>

                    </div>

                </div>
            </c:forEach>

            <c:if test="${check==false}" >
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <li class="page-item">
                        <c:if test="${curr == 1}">

                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>

                        </c:if>
                        <c:if test="${curr > 1}">

                            <a class="page-link" href="?page=${curr-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>

                        </c:if>
                    </li>

                    <c:forEach var="i" begin="1" end="${total}" step="1">
                        <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>    
                        </c:forEach>
                    <li class="page-item">
                        <c:if test="${curr == total}">

                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>

                        </c:if>
                        <c:if test="${curr < total}">

                            <a class="page-link" href="?page=${curr+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>

                        </c:if>    
                    </li>
                </ul>
            </nav>
            </c:if>
        </div>
    </body>
</html>
