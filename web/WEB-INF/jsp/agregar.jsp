<%-- 
    Document   : agregar
    Created on : 14-ene-2022, 0:01:31
    Author     : zepeda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>Nuevo</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4 class="text-center">Agregar Nuevo Registro</h4>
                </div>
                
                <div class="card-body">
                    <form method="post">
                        <label>Nombre</label>
                        <input type="text" name="name" class="form-control">
                        <label>Telefono</label>
                        <input type="text" name="telefono" class="form-control">
                        <input type="submit" value="agregar" class="btn btn-success mt-4">
                        <a href="index.htm" class="btn btn-success mt-4">Regresar</a>
                               
                    </form>
                    
                </div>
            </div>
        </div>
        
       
    </body>
</html>
