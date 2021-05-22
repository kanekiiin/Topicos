package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;

@WebServlet("/app")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Livro l1 = new Livro();
		l1.setTitulo("Livro generico 1");
		l1.setAno(2021);
		l1.setAutor("Um Cara");
		
		Livro l2 = new Livro();
		l2.setTitulo("Livro generico 2");
		l2.setAno(2020);
		l2.setAutor("Um  Segundo Cara");
		
		Livro l3 = new Livro();
		l3.setTitulo("Livro generico 3");
		l3.setAno(2019);
		l3.setAutor("Um Outro Cara");
		
		Livro l4 = new Livro();
		l4.setTitulo("Livro generico 4");
		l4.setAno(2018);
		l4.setAutor("Um Cara qualquer");
		
		Livro l5 = new Livro();
		l5.setTitulo("Livro generico 5");
		l5.setAno(2017);
		l5.setAutor("Jurandir");
		
		List<Livro> listaLivros = new ArrayList<Livro>() {
			{
			add(l1);
			add(l2);
			add(l3);
		    add(l4);
			add(l5);
			}
		};
		
		req.setAttribute("livros", listaLivros);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}
	

}
