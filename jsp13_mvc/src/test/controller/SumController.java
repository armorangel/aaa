package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum.do")
public class SumController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");

		int sum = Integer.valueOf(n1) + Integer.valueOf(n2);

		request.setAttribute("sum", sum);

		RequestDispatcher rd = request.getRequestDispatcher("/sum.jsp");
		rd.forward(request, response);
	}
}
