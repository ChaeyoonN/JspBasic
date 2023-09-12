package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.User;


@WebServlet("/el/obj") //이 파일이 el_obj1.jsp의 데이터 받도록 연결(mapping)
//수동으로 하는 게 xml파일 작성한거임.
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ELServlet() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
		
		User user = new User(request.getParameter("id"),
				request.getParameter("pw"),
				request.getParameter("name"),
				request.getParameter("email"));
		
//		HttpSession session = request.getSession(); //내장객체 세션 받아오기->변수로 받기
		request.getSession().setAttribute("member", user);// 세션 가져와 바로 쓰기
		//오브젝트타입 값의 이름을 String타입의 이름으로 하겠다고 하는 메서드
		
		response.sendRedirect("/JspBasic/EL/el_obj2.jsp");//다른 jsp파일로 응답 주기
		
	}

}
