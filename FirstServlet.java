package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname=request.getParameter("sname");
		String sage=request.getParameter("sage");
		
		HttpSession session=request.getSession();
		session.setAttribute("sname",sname);
		session.setAttribute("sage",sage);
		
		RequestDispatcher req=request.getRequestDispatcher("./Form2.html");
		req.forward(request, response);
	}

}
