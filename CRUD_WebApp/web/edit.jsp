<%@page import="models.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body style="background-color: rgb(50,50,50);">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark justify-content-between">
        <a href="index.jsp" class="navbar-brand">Administración de Usuarios</a>
        <span class="navbar-text text-white">Hecho por Lenin Franco</span>
    </nav>
    <div class="container">
        <%
          Usuario u = UsuarioDAO.selectOne(String.valueOf(request.getAttribute("usuarioid")));
        %>
        <div class="row pt-2">
            <form action="Servlet" method="post">
                <input type="text" name="codigo" placeholder="Codigo/ID" class="form-control" value=<%= u.getCodigo() %> readonly>
                <br>
                <input type="text" name="usuario" placeholder="Nombre de Usuario" class="form-control" value=<%= u.getUsuario()%> required>
                <br>
                <input type="text" name="password" placeholder="Contraseña" class="form-control" value=<%= u.getPassword()%> required>
                <br>
                <input type="submit" class="btn btn-success w-100" name="accion" value="Actualizar" class="btn btn-success">
            </form>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>