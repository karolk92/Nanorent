package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.service.category.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationServiceImpl implements CategoryService {


    @Override
    @Transactional
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public List<Resource> getResources(Long categoryId) {
        return null;
    }

    @Override
    @Transactional
    public void addCategory(String categoryName) {

    }
}