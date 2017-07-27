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
</header>


<div class="col-sm-4">
    <div class="login">
<h2 align="center">Login</h2>

<form action="login" method="GET" align="center">
    Username <input type="text" name="username" placeholder="username..."><span class="glyphicon glyphicon-user"></span></br></br>
   Password <input type="password" name="password" placeholder="password..."><span class="glyphicons glyphicons-lock"></span></br></br>
    <button type="submit" name="login_btn" class="btn btn-primary btn-sm">Login</button> &nbsp&nbsp
    <button type="reset" name="clear_btn"  class="btn btn-danger btn-sm">Cancel</button></br></br>
    <a href="" data-toggle="modal" data-target="#myModal">New user Account</a>
    </form>
   </div>
    </div>
    
    <!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog" align="center">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Register Details</h4>
      </div>
      <div class="modal-body">
      <form action="register" method="GET">
       username <input type="text" place holder="username..." name="username"></br></br>
       password <input type="text" place holder="password..." name="password"></br></br>
       Email <input type="text" place holder="Email..." name="email"></br></br>
       <button type="submit" name="reg_btn" class="btn btn-primary btn-sm">Register</button> &nbsp&nbsp
       <button type="reset" name="clear_btn"  class="btn btn-danger btn-sm">Cancel</button></br></br>
       </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>

</div>
 </body>
</html>
