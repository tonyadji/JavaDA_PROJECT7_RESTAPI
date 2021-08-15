/**
 * 
 */
package com.nnk.springboot.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class CurvePointService {

	private final CurvePointRepository curvePointRepository;
	
	public CurvePointService (CurvePointRepository curvePointRepository) {
		this.curvePointRepository = curvePointRepository;
	}
	
	public CurvePoint createCurvePoint(CurvePoint bid) {
		bid.setCreationDate(new Timestamp(System.currentTimeMillis()));
		return curvePointRepository.save(bid);
	}
	
	public void deleteBid(Integer id) {
		curvePointRepository.deleteById(id);
	}
	
	public List<CurvePoint> getAllCurvePoint(){
		return curvePointRepository.findAll();
	}
	
	public CurvePoint getById(Integer id) {
		return curvePointRepository.findById(id).orElse(null);
	}
	
	public CurvePoint updateCurvePoint(Integer id, CurvePoint updatedEntity) {
		updatedEntity.setId(id);
		return curvePointRepository.save(updatedEntity);
	}
}
