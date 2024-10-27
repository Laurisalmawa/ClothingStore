package com.laurisalmawa.clothingstore.service;

import com.laurisalmawa.clothingstore.service.command.*;
import com.laurisalmawa.clothingstore.service.model.Clothes;

import java.util.List;

public interface ClothesService {

    Clothes createClothes(final CreateClothesCommand command);
    Clothes getClothes(final GetClothesCommand command);
    List<Clothes> getClothesList(final GetClothesListCommand command);
    Clothes updateClothes(final UpdateClothesCommand command);
    boolean deleteClothes(final DeleteClothesCommand command);

    }
