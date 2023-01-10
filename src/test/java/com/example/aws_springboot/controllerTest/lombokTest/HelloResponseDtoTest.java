package com.example.aws_springboot.controllerTest.lombokTest;

import com.example.aws_springboot.Web.Dto.HelloResponseDto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HelloResponseDtoTest {
    @Test
    public void lomBokTest(){
        String name="test";
        int amount=1000;

        HelloResponseDto dto=new HelloResponseDto(name,amount);

        assertEquals(dto.getName(),"test");
        assertEquals(dto.getAmount(),1000);
    }



}
