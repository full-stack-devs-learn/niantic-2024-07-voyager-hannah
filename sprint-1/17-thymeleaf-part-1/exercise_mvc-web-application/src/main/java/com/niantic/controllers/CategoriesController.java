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


    @GetMapping("categories/add_edit")
    public String addCategory(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("description",categoryDao.getCategories());
        model.addAttribute("action", "add");


        return "categories/add_edit";
    }
    @PostMapping("categories/add_edit")
    public String addCategory(Model model, @ModelAttribute("category") Category category) {
        categoryDao.addCategory(category);
        model.addAttribute("category", category);

        return "categories/add_edit";
    }
    @GetMapping("/categories/{id}/edit")
            public String editCategory(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("description", categoryDao.getCategories());
        model.addAttribute("action", "edit");
        return "categories/edit";

    }
    @PostMapping("/categories/{id}/edit")
    public String editCategory(@ModelAttribute("category") Category category, @PathVariable int id)
    {   Category category = categoryDao.getCategoryById(id);
        if (category != null) {
        model.addAttribute("category", category);
        model.addAttribute("action", "delete");

        categoryDao.updateCategory(category);
        return "categories/edit";
    }


    }
}
