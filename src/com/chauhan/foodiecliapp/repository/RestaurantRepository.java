package com.chauhan.foodiecliapp.repository;


import com.chauhan.foodiecliapp.model.Restaurant;
import com.chauhan.foodiecliapp.util.CsvReader;

import java.util.List;



public class RestaurantRepository {

    private List<Restaurant> RestaurantList;

    public RestaurantRepository() {
        CsvReader csvReader = new CsvReader();
        this.RestaurantList = csvReader.readRestaurantsFromCsv();
    }

    public List<Restaurant> getAllRestaurant() {
        return this.RestaurantList;
    }

    }

