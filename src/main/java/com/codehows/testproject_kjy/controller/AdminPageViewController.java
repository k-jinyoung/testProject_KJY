package com.codehows.testproject_kjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageViewController {

    //관리자 권한으로 로그인 했을 때 보이는 페이지
    //포트폴리오 관리 버튼을 클릭했을 때 관리자 권한 메인 페이지로 이동
    @GetMapping("/adminPages")
    public String getAdminPages() {
        return "adminPage";
    }

    //방명록 관리 버튼을 클릭했을 때 해당 페이지로 이동
    @GetMapping("/board-adminPage")
    public String boardAdminPage() {
        return "boardAdminPage";
    }


}
