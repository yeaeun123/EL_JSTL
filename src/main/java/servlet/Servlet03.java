package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/03")
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		/* 파라미터 Parameter = 사용자로부터 받은 데이터
		 * ->GET방식, Query String (url로 넘어옴/ ?키=값&키=값) 
		 * 			FORM method=GET
		 * ->FORM을 통해 전달(method 상관없음)
		 * ->개발자가 손댈수있는 영역이아님 //무조건 String으로 넘어옴
		 * 
		 * 속성 Attribute = 서블릿에서 선언해줘야함 /03뒤에 오는 키와 값이 없어도 불러올 수 있음 
		 * -> 개발자 정의 데이터 (내가 커스텀) */
		 /* 
		 request 영역의 변수의 값 꺼내쓰는 테스트
		 localhost:8080/eljstl/03?id=you&pw=1111&name=재석&num1=100&num2=200		 
		 */
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/03.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
