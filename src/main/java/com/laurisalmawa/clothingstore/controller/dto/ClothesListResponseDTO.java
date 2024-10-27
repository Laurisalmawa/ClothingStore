package com.laurisalmawa.clothingstore.controller.dto;

import com.laurisalmawa.clothingstore.service.model.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClothesListResponseDTO {
    private List<ClothesResponseDTO> clothes;
}
