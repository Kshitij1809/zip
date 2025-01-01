package fi.recipie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.recipie.entity.Recipe;

@Service
public interface RecipeService {

	public Recipe getRecipeById(Integer id);
	
	public List<Recipe> getAllRecipes();

	public Recipe createRecipe(Recipe recipe);

	public Recipe updateRecipe(Integer id, Recipe updatedRecipe);

	public void deleteRecipe(Integer id);
}
