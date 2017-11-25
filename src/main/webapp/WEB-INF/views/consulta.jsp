<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Consulta</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <center>
                <h2>Datos de la mascota </h2>
            </center>
            <br>
            <br>
            <form class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Código:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10">
                        <span>${mascota.codigoFormat}</span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Nombre:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        <span>${mascota.nombre}</span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Especie:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        <span>${mascota.especie.descripcion}</span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Estado:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        <span>${mascota.estado.descripcion}</span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Fecha de nacimiento:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        ${mascota.fechaNacimientoStr}
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Número de visitas</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        ${mascota.numeroVisitas}
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2">
                        <span>
                            <strong>Propietario:</strong>
                        </span>
                    </div>
                    <div class="col-sm-10"> 
                        ${mascota.propietario}
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <div class="col-sm-12"> 
                        <a href="javascript:history.go(-1)">Volver</a>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>