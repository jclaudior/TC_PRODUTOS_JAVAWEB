package br.com.rdtc.servlet;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rdtc.dao.ProdutoDAO;
import br.com.rdtc.model.Produto;


@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* Atributos*/
	ProdutoDAO produtoDAO = new ProdutoDAO();
	
	/* Metodo que recebe um requisição http para /ProdutoServelet e retona a Pagina produtos.jsp junto com atributo produtos que é uma lista de produto*/
	protected void service(HttpServletRequest request, HttpServletResponse response){
		try {
			List<Produto> produtos = produtoDAO.listarProduto();
			request.setAttribute("produtos", produtos);
			RequestDispatcher rd = request.getRequestDispatcher("/produtos.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
