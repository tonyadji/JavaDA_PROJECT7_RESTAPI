/**
 * 
 */
package com.nnk.springboot.services.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.dtos.BidListDto;
import com.nnk.springboot.dtos.create.BidListCreateDto;

/**
 * @author tonys
 *
 */
@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, componentModel = "spring")
public interface BidListMapper {

	public BidList toEntity(BidListCreateDto createDto);
	
	public BidListDto toDto(BidList entity);
}
