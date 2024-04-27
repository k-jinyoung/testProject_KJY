package com.codehows.testproject_kjy.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Table(name = "board")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    //<글 등록에 필요>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "content", nullable = false)
    private String content;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Builder        //빌더 어노테이션을 이용해 객체 생성하기
    public Board(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    //글 수정을 위한 update() 메소드 추가
    public void update(String writer, String content){
        this.writer = writer;
        this.content = content;
    }
}
