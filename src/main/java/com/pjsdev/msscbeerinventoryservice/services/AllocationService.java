package com.pjsdev.msscbeerinventoryservice.services;

import com.pjsdev.brewery.model.BeerOrderDto;

public interface AllocationService {

    //returns true if we allocate everything, false if we're short on allocation
    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
