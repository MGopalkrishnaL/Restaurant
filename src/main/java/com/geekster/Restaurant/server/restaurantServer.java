package com.geekster.Restaurant.server;


import com.geekster.Restaurant.model.restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class restaurantServer {
    private static List<restaurant> restaurants = new ArrayList<>();

    public List<restaurant> findAll() {
        return restaurants;
    }

    public restaurant findByName(String name) {
        Predicate<? super restaurant> predicate = resta -> resta.getName().equals(name);
        restaurant res = restaurants.stream().filter(predicate).findFirst().get();
        return res;
    }

    public void addrestaurant(restaurant res) {
        restaurants.add(res);

    }

    public void deleterestaurant(String name) {
        Predicate<? super restaurant> predicate = rests -> rests.getName().equals(name);
        restaurants.removeIf(predicate);
    }

        public void updateRestaurant(String name,restaurant newest){
            restaurant res = findByName(name);
            res.setName(newest.getName());
            res.setAddress(newest.getAddress());
        }

    }
