package com.colutti.samplegooglegsoncustomadapter.service;

import com.colutti.samplegooglegsoncustomadapter.model.category.Category;

public interface ICategoryService {

    Category deserializationJsonToCategory(String jsonCategory);

}
