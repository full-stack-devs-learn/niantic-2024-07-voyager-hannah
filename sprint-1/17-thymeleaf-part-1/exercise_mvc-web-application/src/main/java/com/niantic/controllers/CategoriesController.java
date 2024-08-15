package com.niantic.controllers;

import com.niantic.models.Category;
import com.niantic.services.CategoryDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CategoriesController {
     private CategoryDao categoriesDao = new CategoryDao();


     @GetMapping("/categories")
     public String index(Model model) {
          var categories = categoriesDao.getAllCategories();
          model.addAttribute("categories", categories);

          return "categories/index";

     }

     @GetMapping("/categories/{id}")
     public String details(Model model, @PathVariable int id) {
          var categories = categoriesDao.getCategoryById(id);
          model.addAttribute("categories", categories);

          return "categories/details";


          @GetMapping("/categories/{id}")
          public String getAllCategories (Model model, @RequestParam(required = false) String id)
          {
               Category category;
               List<Category> categories;

               if (id == null) {
                    category = categoriesDao.getCategoryById(id);
               }
               category = categoriesDao.getAllCategories();
               if (category == null) {
                    return "error/404";
               } else {

               }

               StringBuilder builder = new StringBuilder();

               model.addAttribute("categories", categories);
               return "categories/details";
          }
     }
