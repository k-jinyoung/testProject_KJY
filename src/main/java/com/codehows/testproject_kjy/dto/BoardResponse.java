package com.codehows.testproject_kjy.dto;
//글 조회를 위한 dto

import com.codehows.testproject_kjy.domain.Board;
import lombok.Getter;

@Getter
public class BoardResponse {

    private final String writer;
    private final String content;

    public BoardResponse(Board board) {
        this.writer = board.getWriter();
        this.content = board.getContent();
    }

}
