<%@page import="java.util.ArrayList"%>
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
        if(request.getAttribute("msg") != null){
        %>
        <div class="row pt-2">
            <div class="alert alert-dark alert-dismissible fade show" role="alert">
                <%= request.getAttribute("msg") %>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </div>
        <%
            request.setAttribute("tipo", null);
	    request.setAttribute("msg", null);
        }
        %>    
        <div class="row pt-2">
            <div class="col-12">
                <button type="button" class="btn btn-dark w-100" data-bs-toggle="modal" data-bs-target="#FormAdd">Añadir Usuario</button>
            </div>
        </div>
        <div class="modal fade" id="FormAdd" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content bg-dark">
                    <div class="modal-header text-white">
                        <h5 class="modal-title" id="staticBackdropLabel">Registrar Usuario</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="Servlet" method="post">
                            <input type="text" name="codigo" placeholder="Codigo/ID" class="form-control" required>
                            <br>
                            <input type="text" name="usuario" placeholder="Nombre de Usuario" class="form-control" required>
                            <br>
                            <input type="text" name="password" placeholder="Contraseña" class="form-control" required>
                            <br>
                            <div class="d-grid">
                                <input type="submit" name="accion" value="Guardar" class="btn btn-success">
                                <br>
                                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cerrar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row pt-2">
            <table class="table table-hover table-responsive table-bordered table-dark">
                <tr>
                    <th>Codigo</th>
                    <th>Usuario</th>
                    <th>Contraseña</th>
                    <th>Acciones</th>
                </tr>
                <% 
                ArrayList<Usuario> usuarios = UsuarioDAO.selectAll();
                for(Usuario u: usuarios){
                %>
                <tr>
                    <td><%= u.getCodigo() %></td>
                    <td><%= u.getUsuario()%></td>
                    <td><%= u.getPassword()%></td>
                    <td>
                        <a href="Servlet?accion=eliminar&userid=<%= u.getCodigo() %>" class="btn btn-danger">Eliminar</a>
                        <a href="Servlet?accion=editar&userid=<%= u.getCodigo() %>" class="btn btn-info">Editar</a>
                    </td>
                </tr>
                <%
                }    
                %>
            </table>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>