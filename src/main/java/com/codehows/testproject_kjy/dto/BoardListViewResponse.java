package com.codehows.testproject_kjy.dto;
//View에 데이터를 전달하기 위한 객체 생성

import com.codehows.testproject_kjy.domain.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardListViewResponse {

    private final Long id;
    private final String writer;
    private final String content;
    private LocalDateTime createdAt;

    //생성자 만들기
    public BoardListViewResponse(Board board){
        this.id = board.getId();
        this.writer = board.getWriter();
        this.content = board.getContent();
        this.createdAt = board.getCreatedAt();
    }
}
