<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@page isELIgnored="false" %>
<html>
<head>
<c:url value="/resources/bootstrap/css" var="a"></c:url>
<c:url value="/resources/bootstrap/js" var="b"></c:url>
<link href="${a}/bootstrap.min.css" rel="stylesheet"/>
<link href="${a}/navbar.css" rel="stylesheet"/>
 <script src="${b}/jquery-2.2.3.min.js">
 </script>
<script src="${b}/bootstrap.min.js">
</script>
</head>
<body>
<body>
    <nav class="navbar navbar-default navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <a class="navbar-brand" style="color: navy;font-size: 20px; box-shadow: inset 7px -9px #ff0000 ;" href="#">LetzChaat.com</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index">Home</a></li>
         <li><a href="contactus">Contact</a></li>
        <li class="dropdown">
           <a class="dropdown-toggle" data-toggle="dropdown" href="#">What's New<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">News Flash</a></li>
            <li><a href="#">Job Oppurtunities</a></li>
            <li><a href="#">Gallery</a></li>  
             <li><a href="#">Latest Events</a></li>                        
          </ul>
        </li>
        </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="signup"><span class="glyphicon glyphicon-user"></span> Register</a></li>
        <li><a href="signin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
      
      <div class="jumbotron">
        <h1><span style="font-size: 70px;color: red;">G</span>rooming <span style="color: blue; font-family:sans-serif;font-size: 55px; ">NIIT</span> Professional</h1>
        <p>&ensp;One place for all NIIT Students and Alumni.</p>
         <div class="arrow-style"> <a href="../../components/#navbar" role="button"> Learn more &raquo;</a> </div>
      </div>

    </div>

</body>
</html>
