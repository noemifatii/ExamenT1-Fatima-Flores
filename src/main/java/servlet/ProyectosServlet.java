package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import entidades.Proyectos;

/**
 * Servlet implementation class ProyectosServlet
 */
@WebServlet("/ProyectosServlet")
public class ProyectosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Proyectos> listaProyectos = new ArrayList<Proyectos>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProyectosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("proyectos", listaProyectos);
	    request.getRequestDispatcher("proyectos.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    String nombre = request.getParameter("nombre");
		    String descripcion = request.getParameter("descripcion");
		    String fechaInicio = request.getParameter("fechaInicio");
		    String fechaCulminacion = request.getParameter("fechaCulminacion");
		    String asesorTecnico = request.getParameter("asesorTecnico");
		    String presupuesto = request.getParameter("presupuesto");

		    int id = listaProyectos.size() + 1;

		    Proyectos proyecto = new Proyectos(
		            id, nombre, descripcion, fechaInicio,
		            fechaCulminacion, asesorTecnico, presupuesto);
		   
		    listaProyectos.add(proyecto);
		    
		    request.setAttribute("proyectos", listaProyectos);
		    request.getRequestDispatcher("proyectos.jsp").forward(request, response);

	}

}
