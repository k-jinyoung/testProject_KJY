package com.codehows.testproject_kjy.service;

import com.codehows.testproject_kjy.domain.Board;
import com.codehows.testproject_kjy.dto.AddBoardRequest;
import com.codehows.testproject_kjy.dto.UpdateBoardRequest;
import com.codehows.testproject_kjy.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    //<등록> 메소드
    public Board save(AddBoardRequest request) {

        return boardRepository.save(request.toEntity());
    }

    //<목록 조회> 메소드
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    //<글 조회> 메소드
    public Board findById(long id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    //<글 수정> 메소드
    @Transactional
    public Board update(long id, UpdateBoardRequest request) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        board.update(request.getWriter(), request.getContent());

        return board;
    }

    //<글 삭제> 메소드
    public void delete(long id) {
        boardRepository.deleteById(id);
    }
}
