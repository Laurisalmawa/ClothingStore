package com.laurisalmawa.clothingstore.controller.mapper;

import com.laurisalmawa.clothingstore.controller.dto.*;
import com.laurisalmawa.clothingstore.service.command.*;
import com.laurisalmawa.clothingstore.service.model.Clothes;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface ClothesRestMapper {

    ClothesResponseDTO map(Clothes clothes);

    CreateClothesCommand map(CreateClothesRequestDTO requestDTO);
    GetClothesCommand mapToGetClothes(Long id);
    GetClothesListCommand map(GetClothesListRequestDTO filter);
    UpdateClothesCommand map(UpdateClothesRequestDTO requestDTO, Long id);
    DeleteClothesCommand mapToDeleteClothes(Long id);

    default ClothesListResponseDTO map(List<Clothes> clothesList) {
        return ClothesListResponseDTO.builder()
                .clothes(clothesList.stream().map(this::map).toList())
                .build();
    }
}
