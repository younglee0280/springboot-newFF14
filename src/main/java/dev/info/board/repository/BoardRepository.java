package dev.info.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.info.Entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, String> {
//	List<Board> findAllBoards();  //글 보기

//	Board findBoardById(String id);

//	Board findByIdAndTitle(String Id, String title);
	
	Board saveBoard(Board newBoard); //글 쓰기
	
//	Board findBoardByIdAndContent(String id, String content);

//	Optional<Board> findBoardByContent(String content);
	
//	Board findBoardByContent(String content);
	
	List<Board> modifyBoard(Board.Request request); //글 수정

	List<Board> deleteBoard(String id); //글 삭제
}
