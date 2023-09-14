package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//글번호에 맞는 객체 받음
		int bId = Integer.parseInt(request.getParameter("bId")); 
		BoardVO board = BoardRepository.getInstance().getContent(bId);
		//리퀘스트에 그 객체 담음
		request.setAttribute("content", board);
		//글번호도 전달
		request.setAttribute("boardNo", bId);

	}

}
