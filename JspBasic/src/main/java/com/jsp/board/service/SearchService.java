package com.jsp.board.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String writerKeyword = request.getParameter("keyword");
		//검색된 결과 객체들의 리스트 
		List<BoardVO> list = BoardRepository.getInstance().search(writerKeyword);
		
			
		//결과 리스트를 리퀘스트에 담기
		request.setAttribute("boardList", list);
		
		
	}

}
