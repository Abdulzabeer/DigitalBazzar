<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@include file="Header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value='/resources/images/image1.png' ></c:url>" style="width:100%;">
      </div>

      <div class="item">
        <img src="<c:url value='/resources/images/image4.jpg' ></c:url>" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="<c:url value='/resources/images/image3.jpg' ></c:url>" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div class="container">
  <h2>Mobiles</h2>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="iphonex.jpg" target="_blank">
          <img src="<c:url value='/resources/images/iphonex1.jpg' ></c:url>" alt="iphone" style="width:42%">
          <div class="caption">
            <p>Iphone x</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="oneplus6.jpg" target="_blank">
          <img src="<c:url value='/resources/images/oneplus6.jpg' ></c:url>" alt="oneplus 6" style="width:100%">
          <div class="caption">
            <p>one Plus 6</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="samsungj7.jpg" target="_blank">
          <img src="<c:url value='/resources/images/samsungj7.jpeg' ></c:url>" alt="samsungj7" style="width:100%">
          <div class="caption">
            <p>samasung j7</p>
          </div>
        </a>
      </div>
    </div>
  </div>
</div>

</body>
</html>
    