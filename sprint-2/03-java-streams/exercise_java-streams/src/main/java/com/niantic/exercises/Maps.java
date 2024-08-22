package com.niantic.exercises;

import com.niantic.models.LineItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {

    /*
    1) using a chain of Java Stream functions, convert the list of line items to
       a list of company names.

       The list should not have any duplicate values
       and the list should be sorted alphabetically (A-Z) by company name

     */
    public List<String> mapCompanyNames(List<LineItem> lineItems) {
        var companies = lineItems.stream()
                .map(LineItem::getCompanyName)
                .distinct()
                .sorted()
                .toList();

        return companies;

    }



    /*
    2) using a chain of Java Stream functions, convert the list of line items to
       a list of category names.

       The list should not have any duplicate values
       and the list should be sorted alphabetically (A-Z) by category name

     */
    public List<String> mapCategories(List<LineItem> lineItems)
    {
        var categories = lineItems.stream()
                .map(LineItem::getCategoryName)
                .distinct()
                .sorted()
                .toList();

        return categories;
    }

    /*
    3) using a chain of Java Stream functions, convert the list of line items to
       a list of product names.

       The list should not have any duplicate values
       and the list should be sorted alphabetically (A-Z) by product name

     */
    public List<String> mapProducts(List<LineItem> lineItems)
    {
        var products = lineItems.stream()
                .map(LineItem::getProductName)
                .distinct()
                .sorted()
                .toList();

        return products;
    }

    /*
    4) using a chain of Java Stream functions, convert the list of line items to
       a list of order year.

       The list should not have any duplicate values
       and the list should be sorted numerically (0-9) by year

     */
    public List<String> mapYears(List<LineItem> lineItems) {
        var year = lineItems.stream()
                .map(item -> String.valueOf(item.getOrderDate().getYear()))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return year;
    }

    /*
    5) using a chain of Java Stream functions, convert the list of line items to
       a list of order id.

       The list should not have any duplicate values
       and the list should be sorted numerically (0-9) by order id

     */
    public List<String> mapOrderIds(List<LineItem> lineItems)
    {
        var order = lineItems.stream()
                .map(item -> String.valueOf(item.getOrderId()))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return order;
    }
    }

