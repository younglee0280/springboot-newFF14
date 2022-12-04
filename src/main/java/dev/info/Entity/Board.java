package dev.info.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dev.info.Entity.Board.Response;

//import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Board {

//	@Id
//	@GeneratedValue //(strategy = GenerationType.IDENTITY)
//	@Column
//	private Long idx;
	
	@Id // 기본 키만 직접 할당하기 위해서는 @Id 어노테이션만 사용하고, 
		// 자동 생성 전략을 사용하기 위해서는 @Id에 @GeneratedValue를 추가하고 원하는 키 생성 전략을 선택할 것
	@Column
	private Integer id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String content;

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	public static class Request {
		//private Long idx;
		private Integer id;
		private String title;
		private String content;

		public static Board toEntity(final Request request) {
			return Board.builder().id(request.getId())
					.title(request.getTitle())
					.content(request.getContent())
					.build();
		}

	}

	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	public static class Response {
//		private Long idx;
		private Integer id;
		private String title;
		private String content;

		
		
		
		public static Board.Response toResponse(final Board board) {
			return Response.builder().id(board.getId())
					.title(board.getTitle())
					.content(board.getContent())
					.build();

		}
		
		//List로 뽑아낼 경우
		public static List<Board.Response> toResponseList(final List<Board> boards) {
			List<Board.Response> list = new ArrayList<>();
			for (Board board : boards) {
				list.add(toResponse(board));
				
			}
			return list;
			
		}
		
//		public static Board.Response toResponse(final Board board) {
//			return Response.builder().id(board.getId()).build();
//		}
//		
		}
	

//		public Board findBoard(String Id, String content) {
//			return 
//		}
		
//		public Response findBoardByContent(String content) {
//			return Response.builder().content(Board.getContent()).build(); 	//return이 null이라 에러남
//		}
	
	
		public String findBoardByContent() {  
			Optional<Board> board = Optional.ofNullable(Object.Board(content));
			String response = boardByContent.ofElse("none sub");
			
			//위의 코드를 아래와 같이 축약
			String result = Object.map(Board::findBoard)
									.map(Master::get)
									.orElse("noneSub");
		}
	
	
	
	
	
	
//			
//		public static Board.Response toResponse(Board boards) {
//			return Response.builder().id(Board.getId()).content(Board.getContent()).build();
//				
//				
//			}
		
		
//		public static List<Board.Response> toResponseList(final List<Board> boards)	{
//			List<Board.Response> list = new ArrayList<>();
//			f
//		}
		
//		public static List2<Board.Response> toResponseList(final List2<Board> boards) {
//			List2<Board.Response> list2 = new ArrayList<>();
//			for (Board board : boards1) {
//				list.add(toResponse(board));
//			}
//			return list2;
//		}
			
		
	}