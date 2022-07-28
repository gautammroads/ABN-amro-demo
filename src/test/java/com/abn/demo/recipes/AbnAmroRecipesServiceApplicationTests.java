package com.abn.demo.recipes;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abn.demo.recipes.controller.RecipesController;


@SpringBootTest
class AbnAmroRecipesServiceApplicationTests {

	@Autowired
	private RecipesController recipesController;
	
	@Test
	void contextLoads() {
		assertThat(recipesController).as("Application Context failed to load").isNotNull();
	}

}
