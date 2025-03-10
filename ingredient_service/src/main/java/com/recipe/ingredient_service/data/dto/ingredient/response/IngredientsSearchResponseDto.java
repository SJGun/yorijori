package com.recipe.ingredient_service.data.dto.ingredient.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngredientsSearchResponseDto {
    private Long id;
    private String name;
    private String ingredientImage;
    private int dayprice;
}
