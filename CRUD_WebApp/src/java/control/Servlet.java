package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.*;

public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet Servlet</title>");	    
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
	    out.println("</body>");
	    out.println("</html>");
	}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String ope = request.getParameter("accion");
	if(ope.equals("eliminar")){
	    UsuarioDAO.delete(request.getParameter("userid"));
	    request.setAttribute("msg", "Usuario eliminado correctamente");
	    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	    rd.forward(request, response);
	}
	else if(ope.equals("editar")){
	    request.setAttribute("usuarioid", request.getParameter("userid"));
	    RequestDispatcher rd = request.getRequestDispatcher("/edit.jsp");
	    rd.forward(request, response);
	}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String ope = request.getParameter("accion");
	if(ope.equals("Guardar")){
	    Usuario u = new Usuario();
	    u.setCodigo(request.getParameter("codigo"));
	    u.setUsuario(request.getParameter("usuario"));
	    u.setPassword(request.getParameter("password"));
	    UsuarioDAO.create(u);
	    request.setAttribute("msg", "Usuario añadido correctamente");
	}
	else if(ope.equals("Actualizar")){
	    Usuario u = new Usuario();
	    u.setCodigo(request.getParameter("codigo"));
	    u.setUsuario(request.getParameter("usuario"));
	    u.setPassword(request.getParameter("password"));
	    UsuarioDAO.update(u);
	    request.setAttribute("msg", "Usuario editado correctamente");
	}
	RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
    }

    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>

}
