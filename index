<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FIScan - User Management</title>
</head>

<body>
<div ng-app="myApp" ng-controller="customersCtrl">
	<form action="/userreq" value=x>
		First name:<br>
 	 	<input type="text" name="firstname">
  		<br>
  		Last name:<br>
  		<input type="text" name="lastname">
  		<br>
  		Date of Birth:<br>
 	 	<input type="text" name="dob">
  		<br><br>
  		<input type="submit" value="Create User" x = Post>
  		<input type="submit" value="Delete User" x = Delete>
	</form>

	<p><input type="text" ng-model="name"></p>
	<table>
  		<tr ng-repeat="x in names | filter:name">
    		<td>{{ x.firstname }}</td>
    		<td>{{ x.lastname }}</td>
  		</tr>
	</table>
</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("http://localhost:8080/FIScan/userreq/").then(function (response) {$scope.names = response.data.records;});
});
</script>

</body>

</html>
