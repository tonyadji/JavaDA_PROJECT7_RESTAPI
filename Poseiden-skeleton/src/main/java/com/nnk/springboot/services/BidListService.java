/**
 * 
 */
package com.nnk.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.dtos.BidListDto;
import com.nnk.springboot.dtos.create.BidListCreateDto;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.services.mappers.BidListMapper;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class BidListService {

	private final BidListRepository bidListRepository;
	private final BidListMapper bidListMapper;
	
	public BidListService (BidListRepository bidListRepository, BidListMapper bidListMapper) {
		this.bidListRepository = bidListRepository;
		this.bidListMapper = bidListMapper;
	}
	
	public BidListDto createBid(BidList bid) {
		return bidListMapper.toDto(bidListRepository.save(bid));
	}
	
	public void deleteBid(Integer id) {
		bidListRepository.deleteById(id);
	}
	
	public List<BidList> getAllBidList(){
		return bidListRepository.findAll();
	}
	
	public BidList getById(Integer id) {
		return bidListRepository.findById(id).orElse(null);
	}
	
	public BidList updateBid(Integer id, BidList updatedEntity) {
		return bidListRepository.save(updatedEntity);
	}
}
