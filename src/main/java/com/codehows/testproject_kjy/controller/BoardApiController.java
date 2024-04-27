package com.codehows.testproject_kjy.controller;

import com.codehows.testproject_kjy.domain.Board;
import com.codehows.testproject_kjy.dto.AddBoardRequest;
import com.codehows.testproject_kjy.dto.BoardResponse;
import com.codehows.testproject_kjy.dto.UpdateBoardRequest;
import com.codehows.testproject_kjy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardApiController {

    private final BoardService boardService;

    //<등록>
    @PostMapping("/api/boards")
    public ResponseEntity<Board> addBoard(@RequestBody AddBoardRequest request) {
        Board savedBoard = boardService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedBoard);
    }

    //<목록 조회>
    //GET 요청이 오면 글 목록을 조회할 findAllBoard() 메소드 추가
    @GetMapping("/api/boards")
    public ResponseEntity<List<BoardResponse>> findAllBoards() {
        List<BoardResponse> boards = boardService.findAll()
                .stream()
                .map(BoardResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(boards);
    }

    //<글 조회>
    //GET 요청이 오면 글을 조회할 findBoard() 메소드 추가
    @GetMapping("/api/boards/{id}")
    public ResponseEntity<BoardResponse> findBoard(@PathVariable long id) {
        Board board = boardService.findById(id);

        return ResponseEntity.ok()
                .body(new BoardResponse(board));
    }

    //<글 수정>
    //PUT 요청이 오면 글을 수정할 updateBoard() 메소드 추가
    @PutMapping("/api/boards/{id}")
    public ResponseEntity<Board> updateBoard(@PathVariable long id, @RequestBody UpdateBoardRequest request) {
        Board updatedBoard = boardService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedBoard);
    }

    //<글 삭제>
    //DELETE 요청이 오면 글을 수정할 findBoards() 메소드 추가
    @DeleteMapping("/api/boards/{id}")
    public ResponseEntity<Void> findBoards(@PathVariable long id) {
        boardService.delete(id);

        return ResponseEntity.ok()
                .build();
    }
}
