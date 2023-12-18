package com.colutti.samplegooglegsoncustomadapter.controller;

import com.colutti.samplegooglegsoncustomadapter.model.category.Category;
import com.colutti.samplegooglegsoncustomadapter.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    //Ok, i knowing this is not a good pattern of API REST, but, this is just a sample entry channel :)
    @PostMapping("/convertToCategoryObject")
    public Category convertToCategoryObject(@RequestBody String jsonObject) {
        return categoryService.deserializationJsonToCategory(jsonObject);
    }
}
