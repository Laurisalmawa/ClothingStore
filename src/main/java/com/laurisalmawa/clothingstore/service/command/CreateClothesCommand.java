package com.laurisalmawa.clothingstore.service.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateClothesCommand {
    private Long id;
    private String article;
    private char size;
    private String color;
}
