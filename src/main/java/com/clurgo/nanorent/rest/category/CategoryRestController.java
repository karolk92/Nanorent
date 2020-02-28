package com.clurgo.nanorent.rest.category;

import com.clurgo.nanorent.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryRestController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Categorie> getAllCategories() {
        return categoryService.getCategories();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{categorieId}", produces = "application/json")
    public List<ResourceDTO> getAllResources(@PathVariable("categorieId") Long categorieId) {
        return categoryService.getResources(categorieId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/add/{categorieName}")
    public void addNewCategory(@PathVariable("categoryName") String categoryName) {
        categoryService.addCategorie(categoryName);
    }


}

