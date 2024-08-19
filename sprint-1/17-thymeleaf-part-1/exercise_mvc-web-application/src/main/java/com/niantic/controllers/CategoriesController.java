package com.niantic.controllers;

import com.niantic.models.Category;
import com.niantic.services.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@Controller

public class CategoriesController {
@Autowired
    private CategoryDao categoryDao;


    @GetMapping("/categories")
    public String getCategories(Model model) {

        {
            ArrayList<Category> categories;

            categories = categoryDao.getCategories();

            model.addAttribute("categories", categories);

            return "categories/index";
        }
    }

    @GetMapping("/categories/{id}")
    public String getCategoryById(Model model, @PathVariable("id") int id) {

        Category category = categoryDao.getCategoryById(id);
        model.addAttribute("category", category);
        return "/categories/details";

    }


    @GetMapping("categories/add")
    public String addCategory(Model model) {
        ArrayList<Category> categories;
        categories = categoryDao.getCategories();
        model.addAttribute("category", new Category());
        model.addAttribute("action", "add");
        return "categories/add";
    }
    @PostMapping("categories/add")
    public String addCategory(Model model, @ModelAttribute("category") Category category) {
        categoryDao.addCategory(category);
        model.addAttribute("category", category);

        return "categories/add";
    }
}
