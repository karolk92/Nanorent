package com.clurgo.nanorent.rest.categories;
import java.util.List;

public interface CategoriesService {

    // get all categories
    List<Category> getCategories();

    // get all resources for given Category
    List<Resource> getResources(Long categoryId);

    // add new categorie
    void addCategory(String categoryName);
}
