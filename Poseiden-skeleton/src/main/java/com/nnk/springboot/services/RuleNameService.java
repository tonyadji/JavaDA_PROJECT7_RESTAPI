/**
 * 
 */
package com.nnk.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;

/**
 * @author tonys
 *
 */
@Service
@Transactional
public class RuleNameService {

	private final RuleNameRepository ruleNameRepository;
	
	public RuleNameService (RuleNameRepository ruleNamePointRepository) {
		this.ruleNameRepository = ruleNamePointRepository;
	}
	
	public RuleName createRuleName(RuleName ruleName) {
		return ruleNameRepository.save(ruleName);
	}
	
	public void deleteRuleName(Integer id) {
		ruleNameRepository.deleteById(id);
	}
	
	public List<RuleName> getAllRuleName(){
		return ruleNameRepository.findAll();
	}
	
	public RuleName getById(Integer id) {
		return ruleNameRepository.findById(id).orElse(null);
	}
	
	public RuleName updateRuleName(Integer id, RuleName updatedEntity) {
		updatedEntity.setId(id);
		return ruleNameRepository.save(updatedEntity);
	}
}
