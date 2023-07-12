package com.board.dao;

import com.board.VO.BoardVO;

import java.util.List;
import java.util.Map;

public abstract interface BoardDao { // 인터페이스 추상메소드

	public abstract List<BoardVO> list(Map<String, Object> paramMap);

	public abstract int getCount(Map<String, Object> paramMap);

	public void insertBoard(BoardVO boardVO, int groupId);

	public abstract BoardVO getBoard(int seq);

	public abstract void updateHit(int seq);

	int checkPassword(Map<String, Object> data);

	void updateBoard(BoardVO board);
	
	void deleteBoard(int seq);
	
	public abstract void updateFileName(int seq);
	
	void insertReply(BoardVO boardVO);
	
	void updateOrderNo(BoardVO board);
	
	public void updateBoardGroupId(BoardVO boardVO);
	
	public abstract int getGeneratedGroupId();
	
	public void updateOrderNoForReply(BoardVO boardVO) throws Exception;
	
	public abstract BoardVO getNextBoard(int groupId, int depth, int orderNo);
	
	List<BoardVO> getBoardsGreaterThanOrderNo(int group_id, int order_no);

}
