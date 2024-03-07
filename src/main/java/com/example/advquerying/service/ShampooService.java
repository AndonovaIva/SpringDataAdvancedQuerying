package com.example.advquerying.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public interface ShampooService {

    List<String> getShampoosByGivenSize(String size);

    List<String> getAllShampoosByGivenSizeOrLabel(String size, long id);
    List<String> getAllShampoosWithPriceHigherThan(BigDecimal price);

    long getAllShampoosCountWithPriceLowerThan(BigDecimal price);

    List<String> getAllShampoosContainingIngredient(List<String> ingredients);

    Set<String> getAllShampoosWithIngredientsCountLessThan(int number);

}
