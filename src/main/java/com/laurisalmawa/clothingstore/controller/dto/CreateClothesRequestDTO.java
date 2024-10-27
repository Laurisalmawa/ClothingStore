package com.laurisalmawa.clothingstore.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateClothesRequestDTO {
    private Long id;
    private String article;
    private char size;
    private String color;
}
