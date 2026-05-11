package com.chauhan.foodiecliapp.repository;

import com.chauhan.foodiecliapp.model.Dish;
import com.chauhan.foodiecliapp.util.CsvReader;

import java.util.List;

public class DishRepository {

    private List<Dish> DishList;

    public DishRepository() {
        CsvReader csvReader = new CsvReader();
        this.DishList = csvReader.readDishFromCsv();
    }

    public List<Dish> getAllDishes() {
        return this.DishList;
    }

}
