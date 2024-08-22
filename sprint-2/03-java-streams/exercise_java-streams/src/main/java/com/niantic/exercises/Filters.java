package com.niantic.exercises;

import com.niantic.models.LineItem;

import java.util.ArrayList;
import java.util.List;

public class Filters
{

    /*
    1) using Java Stream functions, filter the *lineItems* list to include only line items for the given company name

    hint: the company name should not be required to be the full name, but could be a partial name
     */
    public List<LineItem> filterByCompanyName(List<LineItem> lineItems, String companyName) {  //empty list
        List<LineItem> result = new ArrayList<>();

        //filter items and collect items
        for (LineItem item : lineItems) {

            if (item.getCompanyName() != null &&
                    item.getCompanyName().toLowerCase().contains(companyName.toLowerCase())) {
                result.add(item);
            }

        }
        return result;
    }


    /*
    2) using Java Stream functions, filter the *lineItems* list to include only line items for the given category name

    hint: the user may search by only a partial category name
     */
    public List<LineItem> filterByCategory(List<LineItem> lineItems, String categoryName)
    {
        List<LineItem> result = new ArrayList<>();

        //filter items and collect items
        for (LineItem item : lineItems) {

            if (item.getCompanyName() != null &&
                    item.getCategoryName().toLowerCase().contains(categoryName.toLowerCase())) {
                result.add(item);
            }

        }
        return result;
    }


    /*
    3) using Java Stream functions, filter the *lineItems* list to include only line items for the given product name

    hint: the user may search by only a partial product name
     */
    public List<LineItem> filterByProduct(List<LineItem> lineItems, String productName)
    {
        List<LineItem> result = new ArrayList<>();

        //filter items and collect items
        for (LineItem item : lineItems) {

            if (item.getCompanyName() != null &&
                    item.getProductName().toLowerCase().contains(productName.toLowerCase())) {
                result.add(item);
            }

        }
        return result;
    }

    /*
    4) using Java Stream functions, filter the *lineItems* list to include only line items for the given order year

     */
    public List<LineItem> filterByYear(List<LineItem> lineItems, int year)
    {    List<LineItem> result = new ArrayList<>();
        for (LineItem item : lineItems) {
            if (item.getOrderDate().getYear() == year) {
                result.add(item);
            }
        }
                return result;
            }





    /*
    5) using Java Stream functions, filter the *lineItems* list to include only line items for the given order id

     */
    public List<LineItem> filterByOrderId(List<LineItem> lineItems, int orderId)
    {
        List<LineItem> result = new ArrayList<>();

        //filter items and collect items
        for (LineItem item : lineItems) {

            if (item.getOrderId() == orderId) {
                result.add(item);
            }

        }
        return result;
    }
}
