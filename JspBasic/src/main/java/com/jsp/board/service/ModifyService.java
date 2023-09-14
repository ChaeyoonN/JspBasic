package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class ModifyService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		//글번호를 가지고 특정 게시물 객체를 리턴하는 메서드
		BoardVO vo = BoardRepository.getInstance().getContent(bId);
		
		request.setAttribute("article", vo);
		request.setAttribute("boardNo", bId);

	}

}
