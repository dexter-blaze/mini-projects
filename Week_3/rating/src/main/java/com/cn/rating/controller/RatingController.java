package com.cn.rating.controller;

import com.cn.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    //use to add new rating
    @PostMapping(path = "/add")
    public void addRating(@RequestBody Map<String, Long> hotelRatingMap) {
        ratingService.addRating(hotelRatingMap);
    }

    //use to update a existibg rating
    @PutMapping (path = "/update")
    public void updateRating(@RequestBody Map<String, Long> hotelRatingMap) {
        ratingService.updateRating(hotelRatingMap);
    }

    //get rating bt id
    @GetMapping(path = "/id/{id}")
    public Long getRatingById(@PathVariable String id) {
        return ratingService.getRatingById(id);
    }

    //get all the ratings
    @GetMapping(path = "getAll")
    public Map<String, Long> getAllRating() {
        return ratingService.getAllRating();
    }

    //delete rating by id
    @DeleteMapping(path = "/id/{id}")
    public void deleteRating(@PathVariable String id) {
        ratingService.deleteRating(id);
    }
}
