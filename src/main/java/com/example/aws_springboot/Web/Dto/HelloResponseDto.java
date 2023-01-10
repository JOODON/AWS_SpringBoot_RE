package com.example.aws_springboot.Web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor//선언된 모든 필드가 포함된 생성자 자동 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
