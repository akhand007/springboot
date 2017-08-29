package com.mysql.springbootmysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.mysql.springbootmysql.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long>{
	
}
