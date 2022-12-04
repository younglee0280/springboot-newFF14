package dev.info.board.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.info.Entity.Board;
import dev.info.Entity.Board.Request;
import dev.info.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;

	//findAllId
	//findBoardById
	//findBoardByTitle
		@Override
	//글 작성
	public Board writeBoard(Board newBoard) {
		return boardRepository.save(newBoard);
	}
	
	//글 저장
	@Override
	public Board saveBoard(Board newBoard) {
		return boardRepository.save(newBoard);
	}
	
//	//전체 글 조회 - Id, title, content
//	@Override
//	public List<Board> findAllBoards() {
//		return boardRepository.findAll();
//	}

//	@Override
//	public List<Board> findBoardById(String id) {
//		return null;
//	}

	//글 조회 - Id로 조회
//	@Override
//	public Board findBoardById(String id) {
//		Board foundBoard = boardRepository.findById(id)
//				.orElseThrow(() -> new RuntimeException(String.format("%s에 해당하는 글이 존재하지 않습니다", id)));
//		return foundBoard;
//	}
//

	@Override
	public Board findBoardByContent(String content) {
		Board foundBoard = boardRepository.findBoardByContent(content)		
				.orElseThrow(() -> new RuntimeException(String.format("%s에 해당하는 글이 존재하지 않습니다", content)));
				return foundBoard;
	}


//	@Override
//	public List<Board> findBoardByContent(String content) {
//		return boardRepository.findBoardByContent;
//	}

	
//	//글 조회 - Id + Content로 조회
//	@Override
//	public Board findBoardByIdAndContent(Request request) {
//		return boardRepository.findBoardByIdAndContent(request.getId(), request.getContent());
//	}
	
	
//	//글 조회 - Content로 조회
//	@Override
//	public Board findBoardByContent(Request request) {
//		return boardRepository.findBoardByContent(request.getContent());
//				
//	}

//	@Override
//	public Board findBoardByContent(Long content) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Board deleteBoard(Request request) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
	//좋아요 
	
	
	
	//작성일자 - Timestamp 사용
	
	
	
	//조회수
	
	
	
	
	
	
	
//	@Override
//	public List2<Board> findBoardById(String id) {
//		return null;
//	}

	
	//글 수정
//	@Override
//	public Board modifyBoard(Request request) {
//		return null;
//	}

//	@Override
//	public Board modifyBoard(Request request) {
//		final Optional<Board> Board = boardRepository.findById(request.getId());  // 기본키인 Id 할당
//		
//		if (board.isPresent()) {
//			final Board foundBoard;
//		}
//		return boardRepository.save(modifyBoard);
//	}
	
//	//글 삭제
//	@Override
//	public Board deleteBoard(Request request) {
//		final List<Board> Board = boardRepository.findById(request.request());
//		
//		return boardRepository.delete(deleteBoard);
//	}
	
	
	
	
	
	
}
