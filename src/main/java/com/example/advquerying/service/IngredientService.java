package com.example.advquerying.service;

import java.math.BigDecimal;
import java.util.List;

public interface IngredientService {

    List<String> getAllIngredientsStartingWith(String letter);

    int deleteIngredientByName(String name);

    int updatedIngredientsPrice(BigDecimal percent);

    int updatedPriceForGivenNames(BigDecimal percent, List<String> names);
}
