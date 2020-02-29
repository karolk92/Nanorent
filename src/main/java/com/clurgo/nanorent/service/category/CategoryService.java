package com.clurgo.nanorent.service.category;

import com.clurgo.nanorent.rest.category.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getCategories();

    CategoryDTO getCategoryById(Long id);

    void addCategory(CategoryDTO categoryDTO);

    void deleteCategoryById(Long id);
}
