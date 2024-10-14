package com.niantic.controllers.apis;

import com.niantic.models.Category;
import com.niantic.services.CategoryDao;
import com.niantic.services.MySqlCategoryDao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//allows us to pass back data
public class CategoriesController
{
    private CategoryDao categoryDao = new MySqlCategoryDao();
    //pass through for the data
    @GetMapping("/api/categories")
    public List<Category> getAllCategories()
    {
        return categoryDao.getCategories();
    }

    @GetMapping("/api/categories/{id}")
    public Category getCategory(@PathVariable int id)
    {
        return categoryDao.getCategory(id);
    }
    //postman to check
    //post puts data in database
    @PostMapping("/api/categories")
    public Category addCategory(@RequestBody Category category)
    {
        return categoryDao.addCategory(category);
    }

}
