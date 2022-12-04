package dev.info.board.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.info.Entity.Board;
import dev.info.Entity.Board.Request;
import dev.info.board.repository.BoardRepository;
import dev.info.board.service.BoardService;
@RestController //SpringBoot로 구축한 REST API 컨트롤러 선언
@RequestMapping("/board") //경로 설정
@CrossOrigin(" * ")
//URL path 정의해서 어떤 작업할지 정의해주기

public class BoardController {
	@Autowired
	private BoardService boardService;	//boardService 가져오기
	
	@Autowired
	private BoardRepository boardRepository;
	
	//글 작성 - post
	@PostMapping(path= "/write")
	public ResponseEntity<Board.Response> createBoard(@RequestBody Board.Request request) { 
		//@RequestBody 옆에 @Valid를 작성하면 RequestBody로 들어오는 객체에 대한 유효성 검사를 실시한다. @Valid 
		
		Board board = Board.Request.toEntity(request);
		
		//글 저장
		Board wroteBoard = boardService.writeBoard(board);
		Board.Response response = Board.Response.toResponse(wroteBoard);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		
	}

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
//	//글 조회 - Id, Title, Content로 찾기 - get
//	@GetMapping(path= "/list")   //write
//	public List<Board.Response> getBoards() {
//
//		List<Board> boards = boardService.findAllBoards();
//		List<Board.Response> response = Board.Response.toResponseList(boards);
//
//		return response;
//	}
	
	//글 조회 - Id로 찾기
//	 @GetMapping("/list/{id}")
//	    public Board.Response getBoards(@PathVariable String id) {
//
//		 Board foundBoard = boardService.findBoardById(id);
//
//	        return Board.Response.toResponse(foundBoard);
//	        
////	        System.out.println("id");
//	 }

	 //글 조회 - Content로 찾기 -------- NullPointException: Cannot invoke "dev.info.Entity.Board.getID()" bc "board" is null
//	 @GetMapping("/list/{content}")
//	 public Board getBoards(@PathVariable String content, @RequestBody Board newBoard){
//		 Long boardContent = Long.parseLong(content);
//		 
//		 Optional<Board> board = boardRepository.findBoardByContent(content);
//		 
//		 board.get().setId(newBoard.getId());
//		 board.get().setTitle(newBoard.getTitle());
//		 
//		 boardRepository.save(board.get());
//		 
//		 return board.get();
		 
	 }
		 
//		 Board foundBoard = boardService.findBoardByContent(content);
//		 return Board.Response.toResponse(foundBoard);
//	 }
		
		 
		 


//	 //글 조회 - Id + Content로 찾기
//	 @GetMapping("/list/{id}/{content}")
//	 	public Board.Response getBoards(@PathVariable String id, @PathVariable String content){
//		 
//		 Board foundBoard = boardService.findBoardById(id).findBoardByContent(content);
//		 return Board.Response.toResponse(foundBoard);
//		 
//	 }
	 

//	//글 수정
//	@PutMapping
//	public List<Board.Response> modifyBoard(@RequestBody Board.Request request) {
//		List<Board> boards = boardService.modifyBoard(request);
//		return Board.Response.toResponseList(boards);
//	}

