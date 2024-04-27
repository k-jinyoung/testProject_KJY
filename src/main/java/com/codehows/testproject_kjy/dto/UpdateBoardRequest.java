package com.codehows.testproject_kjy.dto;
//글 수정 요청을 받을 dto 작성하기


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateBoardRequest {
    private String writer;
    private String content;
}
