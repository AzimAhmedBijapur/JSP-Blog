<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register</title>
</head>
<body>
	<form method="post" action="Register">
		Enter full name <input type="text" id="name" name="name" required >
		Enter username <input type="text" id="username" name="username" required >
		Enter Password <input type="password" id="password" name="password" required>
		<input type="submit" value="submit">
	</form>
</body>
</html>