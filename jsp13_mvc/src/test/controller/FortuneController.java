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
		// 1. 비즈니스로직을 처리하기 위한 모델 객체 호출

		// 2. 모델객체는 비즈니스로직을 처리하고 결과값을 컨트롤러에게 반환
		String result = "동쪽으로 가면 귀인을 만나겠구려";
		// 3. 모델객체가 보내온 결과값을 스코프에 담기
		request.setAttribute("result", result);
		// 4. 뷰페이지로 이동
		RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);

	}
}
