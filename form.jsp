<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Greeting</title>
</head>
<body>
<form:form action="/addCinema" modelAttribute="cinema">
    ID:
    <form:input path="id"/>
    <form:errors path="id"/><br/>



    Name:
    <form:input path="name"/>
    <form:errors path="name"/><br/>


    Location:
    <form:input path="location"/>
    <form:errors path="location"/><br/>

    <input type="hidden" name = "cinema" value =${cinema}>
    <input type="submit"/>
</form:form>
</body>
</html>