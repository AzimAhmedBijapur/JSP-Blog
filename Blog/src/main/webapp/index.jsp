<%@page import="javax.servlet.http.HttpServlet" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSP Blog </title>
</head>
<body>
<%
	response.setHeader("Cache-Control","no-cache,no-store");
%>
<header>
	<nav>
	<ul>
		<li><a href="Blog/Explore">Explore</a></li>
		<li><a href="/WriteBlog">Post</a></li>
		<%
			if(session.getAttribute("username")==null){
		%>
		<li><a href="Login.jsp">Login</a></li>
		<%
			}
		%>
		<li><a href="/Register">Register</a></li>
	</ul>
	</nav>
</header>
<main></main>
<footer></footer>
</body>
</html>
