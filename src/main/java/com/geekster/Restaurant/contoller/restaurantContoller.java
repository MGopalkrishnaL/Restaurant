package com.geekster.Restaurant.contoller;

import com.geekster.Restaurant.model.restaurant;
import com.geekster.Restaurant.server.restaurantServer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Restaurant")
public class restaurantContoller {
    private final restaurantServer resser;

    public restaurantContoller(restaurantServer resser){
        this.resser = resser;
    }
    @PostMapping("/add-res")
//    http://localhost:8080/Restaurant/add-res
    public void addres(@RequestBody restaurant restar){
        resser.addrestaurant(restar);
    }
    @GetMapping("/find-res/name/{name}")
//    http://localhost:8080/Restaurant/find-res/name/{name}
    public restaurant findres(@PathVariable String name){
       return resser.findByName(name);
    }
    @GetMapping("/find-all-res")
//    http://localhost:8080/Restaurant/find-all-res
    public List<restaurant> findAllres(){
        return resser.findAll();
    }

    @PutMapping("/update-res/name/{name}")
//    http://localhost:8080/Restaurant/update-res/name/{name}
    public void updateres(@PathVariable String name,@RequestBody restaurant res){
        resser.updateRestaurant(name,res);
    }

    @DeleteMapping("delete-res/name/{name}")
//    http://localhost:8080/Restaurant/delete-res/name/{name}
    public void deleteRes(@PathVariable String name){
        resser.deleterestaurant(name);
    }

}
