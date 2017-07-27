<html>
<head>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>
    <link rel="stylesheet" type="text/css" href="design.css">
</head>

<body>

<header class="well well-sm">
<h2 align="center">Form</h2>
<div class="dropdown">
  <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">	<%=  request.getAttribute("user")  %>

  <span class="caret"></span></button>
  <ul class="dropdown-menu">
    <li><a href="logout">Log out</a></li>
    <li><a href="">Settings</a></li>
  </ul>
</div>
</header>
    <a href="admin_log">View log entries</a><br><br>
    <a href="items.jsp">Add items</a>
 </body>
</html>
