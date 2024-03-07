package com.example.advquerying.service.impl;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.repositories.IngredientRepository;
import com.example.advquerying.service.IngredientService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<String> getAllIngredientsStartingWith(String letter) {
        return this.ingredientRepository.findAllByNameStartsWith(letter)
                .stream()
                .map(Ingredient::getName)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteIngredientByName(String name) {
        return this.ingredientRepository.deleteIngredientByName(name);
    }

    @Override
    public int updatedIngredientsPrice(BigDecimal percent) {
        return this.ingredientRepository.updateAllByPrice(percent);
    }

    @Override
    public int updatedPriceForGivenNames(BigDecimal percent, List<String> names) {
        return this.ingredientRepository
                .updateAllByPriceForGivenNames(percent, names);
    }
}
