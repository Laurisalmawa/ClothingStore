package com.laurisalmawa.clothingstore.controller;

import com.laurisalmawa.clothingstore.controller.dto.ClothesListResponseDTO;
import com.laurisalmawa.clothingstore.controller.dto.ClothesResponseDTO;
import com.laurisalmawa.clothingstore.controller.dto.CreateClothesRequestDTO;
import com.laurisalmawa.clothingstore.controller.dto.GetClothesListRequestDTO;
import com.laurisalmawa.clothingstore.controller.dto.UpdateClothesRequestDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("api/clothes")
public interface ClothesController {

    @PostMapping
    @ResponseBody ResponseEntity<ClothesResponseDTO> createClothes(
            @RequestBody final CreateClothesRequestDTO createClothesRequestDTO);

    @GetMapping("/{id}")
    @ResponseBody ResponseEntity<ClothesResponseDTO> getClothes(@PathVariable final Long id);

    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody ResponseEntity<ClothesListResponseDTO> getClothesList(
            @RequestBody(required = false) final GetClothesListRequestDTO getClothesListRequestDTO);

    @PutMapping("/{id}")
    @ResponseBody ResponseEntity<ClothesResponseDTO> updateClothes(
            @RequestBody final UpdateClothesRequestDTO updateClothesRequestDTO,
            @PathVariable final Long id);

    @DeleteMapping("/{id}")
    @ResponseBody boolean deleteClothes(@PathVariable final Long id);
}
