package com.codehows.testproject_kjy.controller;
// '/boards Get 요청을 처리할 코드 작성

import com.codehows.testproject_kjy.dto.BoardListViewResponse;
import com.codehows.testproject_kjy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardViewController {

    private final BoardService boardService;

    //로그인 후 보이는 일반유저 페이지
    @GetMapping("/boards")
    public String getBoards(Model model) {
        List<BoardListViewResponse> boards = boardService.findAll().stream()
                .map(BoardListViewResponse::new)
                .toList();

        //게시판 글 리스트 저장
        model.addAttribute("boards", boards);

        //boardList.html로 반환
        return "boardList";
    }

    //방명록 등록 하고 조회하는 부분
    @GetMapping("/new-board")
    public String newBoard() {
        return "newBoard";
    }

}
