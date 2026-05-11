package com.chauhan.foodiecliapp;

import com.chauhan.foodiecliapp.repository.CustomerRepository;
import com.chauhan.foodiecliapp.repository.DishRepository;
import com.chauhan.foodiecliapp.repository.RestaurantRepository;
import com.chauhan.foodiecliapp.util.CsvReader;

public class Main {

    public static void main(String[] args) {


      CsvReader csvReader = new CsvReader();

      //System.out.println("ReadRestaurants from csv file");
      //System.out.println(csvReader.readRestaurantsFromCsv());


        CustomerRepository customerRepository = new CustomerRepository();
        System.out.println("Customers from csv file");
        System.out.println(customerRepository.getAllCustomers());


        DishRepository dishRepository = new DishRepository();
        System.out.println("Dishes from csv file");
        System.out.println(dishRepository.getAllDishes());



        RestaurantRepository restaurantRepository = new RestaurantRepository();
        System.out.println("Restaurant from csv file");
        System.out.println(restaurantRepository.getAllRestaurant());



    }

}
