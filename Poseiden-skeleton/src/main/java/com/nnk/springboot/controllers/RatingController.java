package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.services.RatingService;
import com.nnk.springboot.utils.ModelUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RatingController {
	
	private final RatingService service;
	
	public RatingController(RatingService ratingService) {
		service = ratingService;
	}
	
    @RequestMapping("/rating/list")
    public String home(Model model)
    {
    	model.addAttribute(ModelUtils.MODEL_RATING_LIST, service.getAllRating());
        return "rating/list";
    }

    @GetMapping("/rating/add")
    public String addRatingForm(Rating rating) {
        return "rating/add";
    }

    @PostMapping("/rating/validate")
    public String validate(@Valid Rating rating, BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		return "rating/add";
		}
    	service.createRating(rating);
        return "redirect:/rating/list";
    }

    @GetMapping("/rating/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute(ModelUtils.MODEL_RATING, service.getById(id));
        return "rating/update";
    }

    @PostMapping("/rating/update/{id}")
    public String updateRating(@PathVariable("id") Integer id, @Valid Rating rating,
                             BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		return "rating/update";
		}
    	service.updateRating(id, rating);
        return "redirect:/rating/list";
    }

    @GetMapping("/rating/delete/{id}")
    public String deleteRating(@PathVariable("id") Integer id, Model model) {
        service.deleteRating(id);
        return "redirect:/rating/list";
    }
}
