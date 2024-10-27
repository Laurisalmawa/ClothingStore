package com.laurisalmawa.clothingstore.controller.dto;

import com.laurisalmawa.clothingstore.service.model.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetClothesListRequestDTO implements Serializable {
    private String article;
    private Character size;
    private String color;
}
