package com.chauhan.foodiecliapp.util;

import com.chauhan.foodiecliapp.model.Customer;
import com.chauhan.foodiecliapp.model.Dish;
import com.chauhan.foodiecliapp.model.Restaurant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    //CSV files read and create list of objects


    /*
    Read the data from CSV files and create a List OF OBJECTS
     */

    public List<Dish> readDishFromCsv()
    {
        String dishesCsvFilePath ="C:\\Users\\prasa\\IdeaProjects\\foodi-cli-app-java\\data\\dishes.csv";

        List<Dish> dishesList = new ArrayList<>();

        //java io classes(FileReader, BufferedReader)
        //try with resource
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(dishesCsvFilePath)))
        {
            String csvSplitBy = ",";
            br.readLine();
            while((line=br.readLine()) !=null) {

               String[] data = line.split(csvSplitBy);

               Dish dish = new Dish();
                dish.setId((data[0]));
                dish.setName(data[1]);
                dish.setDescription(data[2]);
                dish.setPrice(Float.parseFloat(data[3]));

              dishesList.add(dish);


            }

        }catch(IOException e)
        {
            System.out.println("File not found in the path : " + dishesCsvFilePath);
            System.exit(0);
            e.printStackTrace();
        }

        return dishesList;

    }
    public List<Customer> readCustomersFromCsv() {
        String customersCsvFilePath = "C:\\Users\\prasa\\IdeaProjects\\foodi-cli-app-java\\data\\customers.csv";

        List<Customer> customersList = new ArrayList<>();

        //java io classes(FileReader, BufferedReader)
        //try with resource
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(customersCsvFilePath))) {
            String csvSplitBy = ",";
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] data = line.split(csvSplitBy);

                Customer customer = new Customer();
                customer.setId(data[0])
                        .setName(data[1])
                        .setEmail(data[2])
                        .setPassword(data[3]);
                customersList.add(customer);


            }

        } catch (IOException e) {
            System.out.println("File not found in the path : " + customersCsvFilePath);
            System.exit(0);
            e.printStackTrace();
        }

        return customersList;

    }

    public List<Restaurant> readRestaurantsFromCsv() {
        String restauranCsvFilePath = "C:\\Users\\prasa\\IdeaProjects\\foodi-cli-app-java\\data\\restaurants.csv";

        List<Restaurant> restaurantsList = new ArrayList<>();

        //java io classes(FileReader, BufferedReader)
        //try with resource
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(restauranCsvFilePath))) {
            String csvSplitBy = ",";
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] data = line.split(csvSplitBy);

                Restaurant restaurants = new Restaurant();
                restaurants.setId(data[0])
                        .setName(data[1])
                        .setAddress(data[2])
                        .setMenu(new ArrayList<>());

                restaurantsList.add(restaurants);


            }

        } catch (IOException e) {
            System.out.println("File not found in the path : " + restauranCsvFilePath);
            System.exit(0);
            e.printStackTrace();
        }

        return restaurantsList;

    }

}
