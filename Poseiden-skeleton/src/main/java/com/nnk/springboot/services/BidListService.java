/**
 * 
 */
package com.nnk.springboot.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class BidListService {

	private final BidListRepository bidListRepository;
	
	public BidListService (BidListRepository bidListRepository) {
		this.bidListRepository = bidListRepository;
	}
	
	public BidList createBid(BidList bid) {
		bid.setCreationDate(new Timestamp(System.currentTimeMillis()));
		return bidListRepository.save(bid);
	}
	
	public void deleteBid(Integer id) {
		bidListRepository.deleteById(id);
	}
	
	public List<BidList> getAllBidList(){
		return bidListRepository.findAll();
	}
	
	public BidList getById(Integer id) {
		return bidListRepository.findByBidListId(id).orElse(null);
	}
	
	public BidList updateBid(Integer id, BidList updatedEntity) {
		updatedEntity.setBidListId(id);
		return bidListRepository.save(updatedEntity);
	}
}
