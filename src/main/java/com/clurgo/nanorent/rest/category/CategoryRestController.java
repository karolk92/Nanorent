package com.clurgo.nanorent.rest.category;

import com.clurgo.nanorent.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryRestController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getCategories() {
        return null;
    }

    @GetMapping(value = "/{categorieId}")
    public List<ResourceDTO> getResources(@PathVariable("categorieId") Long categorieId) {
        return null;
    }

    @PutMapping(value = "/{categorieName}")
    public void addNewCategory(@PathVariable("categoryName") String categoryName) {

    }


}

