<html>
<head>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>
    <link rel="stylesheet" type="text/css" href="design.css">
</head>

<body onload='onload();'>

<header class="well well-sm">
<h2 align="center">Gamerz World</h2>
<div class="dropdown">
  <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">	<%=  request.getSession().getAttribute("uname")  %>

  <span class="caret"></span></button>
  <ul class="dropdown-menu">
    <li><a href="logout">Log out</a></li>
    <li><a href="">Settings</a></li>
  </ul>
</div>
</header>
<form action="insert" method="GET" >
    Game Name <input type="text" name="gname" value=<%=request.getParameter("gname") %>><br><br>
    Price <input type="text" name="price" value=<%=request.getParameter("price") %>><br><br>
    <input type="submit" value="Add" name="add">&nbsp&nbsp
    <input type="reset" value="cancel"> &nbsp&nbsp
    </form>
    <form action="show" method="GET" >
    <input type="submit" value="View items" name="view">
    </form>
     </form>
    <form action="update" method="GET" >
     <input type="hidden" name="gname" value=<%=request.getParameter("gname") %>>
    <input type="hidden" name="price1" value=<%=request.getParameter("price") %>>
    <input type="submit" value="Update">
    </form>
  <div>

    </div>
 </body>
</html>
