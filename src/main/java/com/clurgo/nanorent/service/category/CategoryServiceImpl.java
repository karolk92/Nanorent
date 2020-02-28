package com.clurgo.nanorent.service.category;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


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
