package com.bootpractice.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime registDate;
    private LocalDateTime updateDate;
    private String email;
    private String username;

}
