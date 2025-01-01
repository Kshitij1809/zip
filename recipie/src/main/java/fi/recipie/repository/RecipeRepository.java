package fi.recipie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.recipie.entity.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

}
