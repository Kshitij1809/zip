package fi.recipie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fi.recipie.entity.Recipe;
import fi.recipie.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	RecipeService service;

	@GetMapping("/{id}")
	public Recipe getRecipeById(@PathVariable int id) {
		return service.getRecipeById(id);
	}
	
	@GetMapping
	public List<Recipe> getAllRecipes() {
		return service.getAllRecipes();
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Recipe saveRecipe(@RequestBody Recipe recipe) {
		return service.createRecipe(recipe);
	}

	@PutMapping("{id}")
	public Recipe updateRecipe(@PathVariable int id, @RequestBody Recipe updatedRecipe) {
		return service.updateRecipe(id, updatedRecipe);
	}

	@DeleteMapping("{id}")
	public void deleteRecipe(@PathVariable int id) {
		service.deleteRecipe(id);
	}
}
