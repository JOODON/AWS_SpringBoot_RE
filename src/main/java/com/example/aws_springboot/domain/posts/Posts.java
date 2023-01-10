package com.example.aws_springboot.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor//기본 생성자 자동으로 추가
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK의 생성 규칙을 알려냄 AUTO_IDENTITY (자동으로 생성)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String context;

    private String author;
    //작가

    @Builder
    //해당 클래스의 빌더 패턴 클래스 생성,생성자 상단에 선언시 생성자에 포함된 필드만 빌더 표함
    public Posts(String title,String context,String author){
        this.title=title;
        this.context=context;
        this.author=author;
    }
}
