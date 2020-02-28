package com.clurgo.nanorent.service.reservation;
import java.util.List;

public interface ReservationService {

    // get all categories
    List<Category> getCategories();

    // get all resources for given Category
    List<Resource> getResources(Long categoryId);

    // add new categorie
    void addCategory(String categoryName);
}
