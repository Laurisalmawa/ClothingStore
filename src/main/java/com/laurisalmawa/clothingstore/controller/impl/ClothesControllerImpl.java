package com.laurisalmawa.clothingstore.controller.impl;

import com.laurisalmawa.clothingstore.controller.ClothesController;
import com.laurisalmawa.clothingstore.controller.dto.ClothesListResponseDTO;
import com.laurisalmawa.clothingstore.controller.dto.ClothesResponseDTO;
import com.laurisalmawa.clothingstore.controller.dto.CreateClothesRequestDTO;
import com.laurisalmawa.clothingstore.controller.dto.GetClothesListRequestDTO;
import com.laurisalmawa.clothingstore.controller.dto.UpdateClothesRequestDTO;
import com.laurisalmawa.clothingstore.controller.mapper.ClothesRestMapper;
import com.laurisalmawa.clothingstore.service.ClothesService;
import com.laurisalmawa.clothingstore.service.command.CreateClothesCommand;
import com.laurisalmawa.clothingstore.service.command.DeleteClothesCommand;
import com.laurisalmawa.clothingstore.service.command.GetClothesCommand;
import com.laurisalmawa.clothingstore.service.command.GetClothesListCommand;
import com.laurisalmawa.clothingstore.service.command.UpdateClothesCommand;
import com.laurisalmawa.clothingstore.service.model.Clothes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClothesControllerImpl implements ClothesController {

    private final ClothesService clothesService;
    private final ClothesRestMapper mapper;

    public ResponseEntity<ClothesResponseDTO> createClothes(final CreateClothesRequestDTO createClothesRequestDTO) {
        try {
            final CreateClothesCommand command = this.mapper.map(createClothesRequestDTO);
            final Clothes clothes = clothesService.createClothes(command);
            final ClothesResponseDTO clothesResponseDTO = this.mapper.map(clothes);

            return ResponseEntity.ok(clothesResponseDTO);
        } catch(Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<ClothesResponseDTO> getClothes(final Long id) {
        try {
            final GetClothesCommand command = this.mapper.mapToGetClothes(id);
            final Clothes clothes = clothesService.getClothes(command);
            final ClothesResponseDTO clothesResponseDTO = this.mapper.map(clothes);

            return ResponseEntity.ok(clothesResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<ClothesListResponseDTO> getClothesList(final GetClothesListRequestDTO filter) {
        try {
            final GetClothesListCommand command = this.mapper.map(filter);
            final List<Clothes> clothesList = clothesService.getClothesList(command);
            final ClothesListResponseDTO clothesResponseDTO = this.mapper.map(clothesList);

            return ResponseEntity.ok(clothesResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<ClothesResponseDTO> updateClothes(
            final UpdateClothesRequestDTO updateClothesRequestDTO,
            final Long id) {
        try {
            final UpdateClothesCommand command = this.mapper.map(updateClothesRequestDTO, id);
            final Clothes clothes = clothesService.updateClothes(command);
            final ClothesResponseDTO clothesResponseDTO = this.mapper.map(clothes);

            return ResponseEntity.ok(clothesResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public boolean deleteClothes(final Long id) {
        final DeleteClothesCommand command = this.mapper.mapToDeleteClothes(id);
        return this.clothesService.deleteClothes(command);
    }
}
