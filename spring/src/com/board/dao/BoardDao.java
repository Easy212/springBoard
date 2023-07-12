package com.board.dao;

import com.board.VO.BoardVO;

import java.util.List;
import java.util.Map;

public abstract interface BoardDao {
	
	public abstract List<BoardVO> list(Map<String, Object> paramMap);

	public abstract int getCount(Map<String, Object> paramMap);
	
	// 게시물 저장 메서드 추가
    public abstract void insertBoard(BoardVO boardVO);
    
    

}
