package com.nnk.springboot.services.mappers;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.dtos.BidListDto;
import com.nnk.springboot.dtos.create.BidListCreateDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-21T18:02:20+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_162 (Oracle Corporation)"
)
@Component
public class BidListMapperImpl implements BidListMapper {

    @Override
    public BidList toEntity(BidListCreateDto createDto) {
        if ( createDto == null ) {
            return null;
        }

        BidList bidList = new BidList();

        if ( createDto.getAccount() != null ) {
            bidList.setAccount( createDto.getAccount() );
        }
        if ( createDto.getType() != null ) {
            bidList.setType( createDto.getType() );
        }
        if ( createDto.getBidQuantity() != null ) {
            bidList.setBidQuantity( createDto.getBidQuantity() );
        }

        return bidList;
    }

    @Override
    public BidListDto toDto(BidList entity) {
        if ( entity == null ) {
            return null;
        }

        BidListDto bidListDto = new BidListDto();

        if ( entity.getAccount() != null ) {
            bidListDto.setAccount( entity.getAccount() );
        }
        if ( entity.getType() != null ) {
            bidListDto.setType( entity.getType() );
        }
        if ( entity.getBidQuantity() != null ) {
            bidListDto.setBidQuantity( entity.getBidQuantity() );
        }
        if ( entity.getAskQuantity() != null ) {
            bidListDto.setAskQuantity( entity.getAskQuantity() );
        }
        if ( entity.getBid() != null ) {
            bidListDto.setBid( entity.getBid() );
        }
        if ( entity.getAsk() != null ) {
            bidListDto.setAsk( entity.getAsk() );
        }
        if ( entity.getBenchmark() != null ) {
            bidListDto.setBenchmark( entity.getBenchmark() );
        }
        if ( entity.getBidListDate() != null ) {
            bidListDto.setBidListDate( entity.getBidListDate() );
        }
        if ( entity.getCommentary() != null ) {
            bidListDto.setCommentary( entity.getCommentary() );
        }
        if ( entity.getSecurity() != null ) {
            bidListDto.setSecurity( entity.getSecurity() );
        }
        if ( entity.getStatus() != null ) {
            bidListDto.setStatus( entity.getStatus() );
        }
        if ( entity.getTrader() != null ) {
            bidListDto.setTrader( entity.getTrader() );
        }
        if ( entity.getBook() != null ) {
            bidListDto.setBook( entity.getBook() );
        }
        if ( entity.getCreationName() != null ) {
            bidListDto.setCreationName( entity.getCreationName() );
        }
        if ( entity.getCreationDate() != null ) {
            bidListDto.setCreationDate( entity.getCreationDate() );
        }
        if ( entity.getRevisionName() != null ) {
            bidListDto.setRevisionName( entity.getRevisionName() );
        }
        if ( entity.getRevisionDate() != null ) {
            bidListDto.setRevisionDate( entity.getRevisionDate() );
        }
        if ( entity.getDealName() != null ) {
            bidListDto.setDealName( entity.getDealName() );
        }
        if ( entity.getDealType() != null ) {
            bidListDto.setDealType( entity.getDealType() );
        }
        if ( entity.getSourceListId() != null ) {
            bidListDto.setSourceListId( entity.getSourceListId() );
        }
        if ( entity.getSide() != null ) {
            bidListDto.setSide( entity.getSide() );
        }

        return bidListDto;
    }
}
