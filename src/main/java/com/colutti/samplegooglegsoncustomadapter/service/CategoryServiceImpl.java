package com.colutti.samplegooglegsoncustomadapter.service;

import com.colutti.samplegooglegsoncustomadapter.model.category.Category;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private final Gson categoryGsonBuilder;

    public CategoryServiceImpl(Gson categoryGsonBuilder) {
        this.categoryGsonBuilder = categoryGsonBuilder;
    }

    @Override
    public Category deserializationJsonToCategory(String jsonCategory) {
        return this.categoryGsonBuilder.fromJson(jsonCategory, Category.class);
    }
}
