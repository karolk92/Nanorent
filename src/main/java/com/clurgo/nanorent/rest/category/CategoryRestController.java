package com.clurgo.nanorent.rest.category;

import com.clurgo.nanorent.rest.category.model.CategoryDTO;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import com.clurgo.nanorent.service.category.CategoryService;
import com.clurgo.nanorent.service.resource.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryRestController {

    private final CategoryService categoryService;
    private final ResourceService resourceService;

    @GetMapping
    public List<CategoryDTO> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping(value = "/{id}")
    public CategoryDTO getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping
    public void addCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.addCategory(categoryDTO);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteCategoryById(@PathVariable("id") Long id) {
        categoryService.deleteCategoryById(id);

    }

    @GetMapping("/{categoryId}/resources")
    public List<ResourceDTO> getResourcesByCategoryId(@PathVariable("categoryId") Long categoryId) {
        return resourceService.getResourcesByCategoryId(categoryId);
    }

    @PutMapping("/{categoryId}/resources")
    public void addResource(@PathVariable("categoryId") Long categoryId,
                            @RequestBody ResourceDTO resourceDTO) {
        resourceService.addResource(resourceDTO);
    }


}

