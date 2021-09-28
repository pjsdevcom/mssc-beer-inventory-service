package com.pjsdev.msscbeerinventoryservice.web.mappers;

import com.pjsdev.msscbeerinventoryservice.domain.BeerInventory;
import com.pjsdev.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerInventoryMapper {

    BeerInventory dtoToBeerInventory(BeerInventoryDto dto);

    BeerInventoryDto beerInventoryToDto(BeerInventory beerInventory);
}
