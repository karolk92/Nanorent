package com.clurgo.nanorent.rest.category;

import com.clurgo.nanorent.rest.category.errors.CategoryNotFoundException;
import com.clurgo.nanorent.rest.category.model.CategoryDTO;
import com.clurgo.nanorent.rest.reservation.errors.AlreadyDefinedReservationException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationInPastException;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import com.clurgo.nanorent.service.category.CategoryService;
import com.clurgo.nanorent.service.resource.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryRestController {

    private final CategoryService categoryService;
    private final ResourceService resourceService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryDTO> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping(value = "/{id}")
    @ExceptionHandler({CategoryNotFoundException.class,})
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.addCategory(categoryDTO);

    }

    @DeleteMapping(value = "/{id}")
    @ExceptionHandler({CategoryNotFoundException.class,})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategoryById(@PathVariable("id") Long id) {
        categoryService.deleteCategoryById(id);

    }

    @GetMapping("/{categoryId}/resources")
    @ExceptionHandler({CategoryNotFoundException.class,})
    @ResponseStatus(HttpStatus.OK)
    public List<ResourceDTO> getResourcesByCategoryId(@PathVariable("categoryId") Long categoryId) {
        return resourceService.getResourcesByCategoryId(categoryId);
    }

    @PutMapping("/{categoryId}/resources")
    @ExceptionHandler({CategoryNotFoundException.class,})
    @ResponseStatus(HttpStatus.CREATED)
    public void addResource(@PathVariable("categoryId") Long categoryId,
                            @RequestBody ResourceDTO resourceDTO) {
        resourceService.addResource(resourceDTO);
    }


}

