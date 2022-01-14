<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>CRUD</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregar.htm" class="btn btn-primary">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            
                            <tr>
                                <th>ID</th>
                                <th>NOMBRES</th>
                                <th>TELEFONO</th>
                                <th>ACCIONES</th>
                                    
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="datos" items="${lista}">
                            <tr>
                                <td>${datos.id_persona}</td>
                                <td>${datos.name}</td>
                                <td>${datos.telefono}</td>
                                <td>
                                    <a href="editar.htm?id_persona=${datos.id_persona}" class="btn btn-warning ">Editar</a>
                                    <a href="delete.htm?id_persona=${datos.id_persona}" class="btn btn-danger ">Eliminar</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    
                    
                </div>
            </div>
        </div>
     
    </body>
</html>
