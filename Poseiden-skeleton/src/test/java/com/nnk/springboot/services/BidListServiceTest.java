/**
 * 
 */
package com.nnk.springboot.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.dtos.BidListDto;
import com.nnk.springboot.dtos.create.BidListCreateDto;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.services.mappers.BidListMapperImpl;

/**
 * @author tonys
 *
 */
@ExtendWith(MockitoExtension.class)
class BidListServiceTest {
	/*
	@InjectMocks
	private BidListService service;
	
	@Mock
	private BidListRepository bidListRepository;
	
	@Spy
	private BidListMapperImpl bidListMapper;
	
	private BidListCreateDto createDto;

	@BeforeEach
	void setUp() throws Exception {
		createDto = new BidListCreateDto("Account", "Type", 50d);
	}

	@Test
	void testCreateBid() {
		//arrange
		final BidList bidList = new BidList("Account", "Type", 50d);
		when(bidListRepository.save(ArgumentMatchers.any(BidList.class))).thenReturn(bidList);
		
		//act
		final BidListDto dto = service.createBid(createDto);
		
		//assert
		assertThat(dto.getBidQuantity()).isEqualTo(50d);
		
		verify(bidListMapper, times(1)).toEntity(createDto);
	}

	@Test
	void testDeleteBid() {
		//arrange
		doNothing().when(bidListRepository).deleteById(ArgumentMatchers.anyInt());
		
		//act
		service.deleteBid(17);
				
				
		verify(bidListRepository, times(1)).deleteById(17);
	}
	*/
}
