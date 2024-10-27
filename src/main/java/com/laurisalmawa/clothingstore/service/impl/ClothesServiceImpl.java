package com.laurisalmawa.clothingstore.service.impl;

import com.laurisalmawa.clothingstore.repository.ClothesRepository;
import com.laurisalmawa.clothingstore.service.ClothesService;
import com.laurisalmawa.clothingstore.service.command.*;
import com.laurisalmawa.clothingstore.service.model.Clothes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClothesServiceImpl implements ClothesService {
    private final ClothesRepository clothesRepository;

    public Clothes createClothes(final CreateClothesCommand command) {
        return Clothes.builder()
                .id(command.getId())
                .article(command.getArticle())
                .size(command.getSize())
                .color(command.getColor())
                .build();
    }

    public Clothes getClothes(final GetClothesCommand command) {
        return Clothes.builder()
                .id(command.getId())
                .article("Shirt")
                .size('m')
                .color("pink")
                .build();
    }

    public List<Clothes> getClothesList(final GetClothesListCommand command) {
        return List.of(Clothes.builder()
                .id(43L)
                .article(command.getArticle() != null ? command.getArticle() : "Shirt")
                .size(command.getSize() != null ? command.getSize() :'m')
                .color(command.getColor() != null ? command.getColor() :"pink")
                .build());
    }

    public Clothes updateClothes(final UpdateClothesCommand command) {
        return Clothes.builder()
                .id(command.getId())
                .article(command.getArticle())
                .size(command.getSize())
                .color(command.getColor())
                .build();
    }

    public boolean deleteClothes(final DeleteClothesCommand command) {
        return true;
    }

}
