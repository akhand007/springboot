package com.mysql.springbootmysql.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mysql.springbootmysql.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{
	
	Optional<Category> findByDescription(String description);

}
