<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Consulta</title>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>Datos de la mascota </h2>
            <form class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2">Código:</label>
                    <div class="col-sm-10">
                        <span>${mascota.codigo}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Nombre</label>
                    <div class="col-sm-10"> 
                        <span>${mascota.nombre}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Especie:</label>
                    <div class="col-sm-10"> 
                        <span>${mascota.especie.descripcion}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Estado:</label>
                    <div class="col-sm-10"> 
                        <span>${mascota.estado.descripcion}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Fecha nacimiento:</label>
                    <div class="col-sm-10"> 
                        ${mascota.fechaNacimientoStr}
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Número visitas:</label>
                    <div class="col-sm-10"> 
                        ${mascota.numeroVisitas}
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Propietario:</label>
                    <div class="col-sm-10"> 
                        ${mascota.propietario}
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>