package com.clurgo.nanorent.rest.category;

import com.clurgo.nanorent.rest.category.model.CategoryDTO;
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
    public List<CategoryDTO> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping(value = "/{categorieId}")
    public CategoryDTO getResources(@PathVariable("categorieId") Long categorieId) {
        return categoryService.getCategoryById(categorieId);
    }

    @PutMapping
    public void addCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.addCategory(categoryDTO);

    }


}

