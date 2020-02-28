package com.clurgo.nanorent.service.category;
import java.util.List;

public interface CategoryService {

    // get all categories
    List<Category> getCategories();

    // get all resources for given Category
    List<Resource> getResources(Long categoryId);

    // add new categorie
    void addCategory(String categoryName);
}
