/**
 * 
 */
package com.nnk.springboot.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class TradeService {

	private final TradeRepository tradeRepository;
	
	public TradeService (TradeRepository tradeRepository) {
		this.tradeRepository = tradeRepository;
	}
	
	public Trade createTrade(Trade trade) {
		trade.setCreationDate(new Timestamp(System.currentTimeMillis()));
		return tradeRepository.save(trade);
	}
	
	public void deleteTrade(Integer id) {
		tradeRepository.deleteById(id);
	}
	
	public List<Trade> getAllTrade(){
		return tradeRepository.findAll();
	}
	
	public Trade getById(Integer id) {
		return tradeRepository.findByTradeId(id).orElse(null);
	}
	
	public Trade updateTrade(Integer id, Trade updatedEntity) {
		updatedEntity.setTradeId(id);
		return tradeRepository.save(updatedEntity);
	}
}
