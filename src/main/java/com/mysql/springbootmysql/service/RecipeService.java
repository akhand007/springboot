package com.mysql.springbootmysql.service;

import java.util.Set;

import com.mysql.springbootmysql.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
	Recipe findById(Long l);
	Recipe saveRecipe(Recipe save);
	void deleteById(Long l);
}
