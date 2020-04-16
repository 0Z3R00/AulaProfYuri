package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;


	@WebServlet("/ManterPais.do")
	public class manterPaisController extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String nome = request.getParameter("nome");
			long populacao = Long.parseLong(request.getParameter("populacao"));
			double area = Double.parseDouble(request.getParameter("area"));		

			//instanciar o javabean
			Pais pais = new Pais();
			pais.setNome(nome);
			pais.setPopulacao(populacao);
			pais.setArea(area);

			//instanciar o service
			PaisService  ps = new PaisService();
			ps.criar(pais);
			pais = ps.carregar(pais.getId());

			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			out.println("<div style=\"height:70px; width: 500px;\">");
			out.println("<div style=\"background-color:blue; "
					+ "height:35px; width: "
					+ "500px; "
					+ "border: 5px outset\">");
			out.println(	"id: "+pais.getId()+"<br>");
			out.println(	"nome: "+pais.getNome()+"<br>");
			out.println("</div>");
			out.println("<div style=\"background-color:lightblue; "
					+ "height:35px; width: "
					+ "500px; "
					+ "border: 5px outset\">");
			out.println(	"fone: "+pais.getPopulacao()+"<br>");
			out.println(	"e-mail: "+pais.getArea()+"<br>");
			out.println("</div>");
			out.println("</div>");
			out.println("</body></html>");

		}

	}
