package com.laurisalmawa.clothingstore.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clothes {
    private Long id;
    private String article;
    private char size;
    private String color;
}
