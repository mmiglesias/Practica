<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Hello World</h2>
		<h2>
                    <c:if test="${not empty mascotas}">

                            <ul>
                                    <c:forEach var="mascota" items="${mascotas}">
                                            <li>${mascota.nombre}</li>
                                    </c:forEach>
                            </ul>

                    </c:if>
		</h2>
                <h3>
			<a href="consulta?codigo=1">Click Here</a>
		</h3>
	</center>
</body>
</html>