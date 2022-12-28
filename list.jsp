<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List of Cinemas</title>
</head>
<body>
<c:forEach items="${cinemas}" var="cinema">
    <p>Name: ${cinema.name}, Location:  ${cinema.location} <a href="/films?cinema=${cinema.id}">[Films]</a></p>
</c:forEach>
</body>
</html>