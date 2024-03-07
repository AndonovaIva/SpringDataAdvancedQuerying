package com.example.advquerying;

import com.example.advquerying.repositories.IngredientRepository;
import com.example.advquerying.service.IngredientService;
import com.example.advquerying.service.ShampooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final ShampooService shampooService;
    private final IngredientService ingredientService;

    public CommandLineRunnerImpl(ShampooService shampooService, IngredientRepository ingredientRepository, IngredientService ingredientService) {
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }

    @Override
    public void run(String... args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        this.shampooService.getShampoosByGivenSize(bf.readLine()).forEach(System.out::println);

        //this.shampooService.getAllShampoosByGivenSizeOrLabel("medium", 10).forEach(System.out::println);

        //this.shampooService.getAllShampoosWithPriceHigherThan(BigDecimal.valueOf(5)).forEach(System.out::println);

        //this.ingredientService.getAllIngredientsStartingWith("M").forEach(System.out::println);

        //System.out.println(this.shampooService.getAllShampoosCountWithPriceLowerThan(BigDecimal.valueOf(8.5)));

        //this.shampooService.getAllShampoosWithIngredientsCountLessThan(2).forEach(System.out::println);

        //System.out.println(this.ingredientService.deleteIngredientByName("Nettle"));

        //System.out.println(this.ingredientService.updatedIngredientsPrice(BigDecimal.valueOf(1.1)));

        //System.out.println(this.ingredientService.updatedPriceForGivenNames(BigDecimal.valueOf(1.1), List.of("Apple", "Macadamia Oil")));
    }

}
