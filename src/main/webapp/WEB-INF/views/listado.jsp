<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Listado</title>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css"/>
    </head>
<body>
    <center>
        <h2>Mascotas</h2>
        <table id="tabla" class="display" width="100%"></table>
        <script>
            var dataSet = [
                <c:if test="${not empty mascotas}">
                <c:forEach var="mascota" items="${mascotas}">
                    ['${mascota.codigo}', '${mascota.nombre}'],
                </c:forEach>
                </c:if>
            ];

            $(document).ready(function() {
                $('#tabla').DataTable( {
                    data: dataSet,
                    columns: [
                        { title: "Código" },
                        { title: "Nombre"}
                    ]
                });
            });
        </script>
        <h3>
                <a href="consulta?codigo=1">Click Here</a>
        </h3>
    </center>
</body>
</html>