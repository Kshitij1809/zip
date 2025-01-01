package fi.recipie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.recipie.entity.Recipe;
import fi.recipie.repository.RecipeRepository;

@Component
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	RecipeRepository repository;

	@Override
	public Recipe getRecipeById(Integer id) {

		return repository.findById(id).get();
	}

	@Override
	public Recipe createRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return repository.save(recipe);
	}

	@Override
	public Recipe updateRecipe(Integer id, Recipe updatedRecipe) {

		Recipe recipe = repository.findById(id).get();
		recipe.setTitle(updatedRecipe.getTitle());
		recipe.setDescription(updatedRecipe.getDescription());
		recipe.setIngredients(updatedRecipe.getIngredients());
		recipe.setInstructions(updatedRecipe.getInstructions());
		recipe.setDifficultyLevel(updatedRecipe.getDifficultyLevel());
		recipe.setCuisineType(updatedRecipe.getCuisineType());

		return repository.save(recipe);

	}

	@Override
	public void deleteRecipe(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Recipe> getAllRecipes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
