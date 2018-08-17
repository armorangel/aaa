package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fortune.do")
public class FortuneController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. ����Ͻ������� ó���ϱ� ���� �� ��ü ȣ��

		// 2. �𵨰�ü�� ����Ͻ������� ó���ϰ� ������� ��Ʈ�ѷ����� ��ȯ
		String result = "�������� ���� ������ �����ڱ���";
		// 3. �𵨰�ü�� ������ ������� �������� ���
		request.setAttribute("result", result);
		// 4. ���������� �̵�
		RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);

	}
}
