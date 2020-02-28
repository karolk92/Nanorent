package com.clurgo.nanorent.rest.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesRestController {

    private final CategoriesService categoriesService;

    @Autowired
    public CategoriesRestController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Categorie> getAllCategories() {
        return categoriesService.getCategories();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{categorieId}", produces = "application/json")
    public List<ResourceDTO> getAllResources(@PathVariable("categorieId") Long categorieId) {
        return categoriesService.getResources(categorieId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/add/{categorieName}")
    public void addNewCategory(@PathVariable("categoryName") String categoryName) {
        categoriesService.addCategorie(categoryName);
    }


}

