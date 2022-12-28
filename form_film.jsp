<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Greeting</title>
</head>
<body>
<form:form action="/addFilm" modelAttribute="film">
    Name:
    <form:input path="name"/>


    Director:
    <form:input path="director"/>


    Genre:
    <form:input path="genre"/>

    Runtime:
    <form:input path="runtime"/>

    <input type="submit"/>
</form:form>
</body>
</html>