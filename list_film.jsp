<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List of Cinemas</title>
</head>
<body>
<c:forEach items="${films}" var="film">
    <p>Name: ${film.name}, Director:  ${film.director}, Genre:  ${film.genre}, Runtime:  ${film.runtime} <a href="/newFilm?cinema=${cinema.id}">[newFilm]</a></p>
</c:forEach>
</body>
</html>