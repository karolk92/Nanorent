package com.clurgo.nanorent.service.category;

import com.clurgo.nanorent.entity.Category;
import com.clurgo.nanorent.repository.CategoryRepository;
import com.clurgo.nanorent.rest.category.model.CategoryDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getCategories() {
        List<Category> categories = categoryRepository.findAll();

        return categories.stream().map(o -> CategoryDTO.builder()
            .id(o.getId())
            .name(o.getName())
            .resources(o.getResources())
            .build())
            .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow();

        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .resources(category.getResources())
                .build();
    }

    @Override
    public void addCategory(CategoryDTO categoryDTO) {
        Category category = Category.builder()
                .name(categoryDTO.getName())
                .resources(categoryDTO.getResources())
                .build();

        categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
