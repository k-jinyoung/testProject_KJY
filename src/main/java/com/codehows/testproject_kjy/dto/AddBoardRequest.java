package com.codehows.testproject_kjy.dto;
//글 등록을 위한 dto

import com.codehows.testproject_kjy.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddBoardRequest {

    private String writer;
    private String content;

    //생성자를 이용해 객체 생성하기
    public Board toEntity(){
        return Board.builder()
                .writer(writer)
                .content(content)
                .build();
    }
}
