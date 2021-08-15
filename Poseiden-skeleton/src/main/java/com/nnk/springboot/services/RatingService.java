/**
 * 
 */
package com.nnk.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class RatingService {

	private final RatingRepository ratingRepository;
	
	public RatingService (RatingRepository curvePointRepository) {
		this.ratingRepository = curvePointRepository;
	}
	
	public Rating createRating(Rating rating) {
		return ratingRepository.save(rating);
	}
	
	public void deleteRating(Integer id) {
		ratingRepository.deleteById(id);
	}
	
	public List<Rating> getAllRating(){
		return ratingRepository.findAll();
	}
	
	public Rating getById(Integer id) {
		return ratingRepository.findById(id).orElse(null);
	}
	
	public Rating updateRating(Integer id, Rating updatedEntity) {
		updatedEntity.setId(id);
		return ratingRepository.save(updatedEntity);
	}
}
