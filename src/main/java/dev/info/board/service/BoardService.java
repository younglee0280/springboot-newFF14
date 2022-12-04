package dev.info.board.service;

import java.util.List;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;

import dev.info.Entity.Board;
import dev.info.Entity.Board.Request;

public interface BoardService {
	//글 작성
	Board writeBoard(Board newBoard);
	
	//글 저장
	Board saveBoard(Board newBoard);
	
	//전체 글 조회
	List<Board> findAllBoards();
	
	
	
	//페이지당 10개씩 나오도록 - 페이징 처리는 따로 해야할듯
	
//	public Page<Board> getBoardListPage(){
//		PageRequest pageRequest = PageRequest.of(0, 10);
//		return boardRepository.findBoardsByIsDel("N", pageRequest);
		
//	}
	
	
	//ID 조회
//	List<Board> findByBoardId(String id);

	//글 조회 - Id로 조회
//	Board findBoardById(String id);

	//글 조회 - Content로 조회
//	Board findBoardByContent(Long content);

	Board findBoardByContent(Object content);
	
	//글 조회 - Id + Content
//	Board findBoardByIdAndContent(Request request);

}
	
	//좋아요
	
	
	//작성일자 - Timestamp
	
	

	//조회수
	
	
	
	//글 수정
//	Board modifyBoard(Request request);
	
	
	//글 한 개씩 삭제 - ????
//	Board deleteBoard(Request request);
//
