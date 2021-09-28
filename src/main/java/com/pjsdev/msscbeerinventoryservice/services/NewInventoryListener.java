package com.pjsdev.msscbeerinventoryservice.services;

import com.pjsdev.brewery.model.events.NewInventoryEvent;
import com.pjsdev.msscbeerinventoryservice.config.JmsConfig;
import com.pjsdev.msscbeerinventoryservice.domain.BeerInventory;
import com.pjsdev.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class NewInventoryListener {

    private final BeerInventoryRepository beerInventoryRepository;

    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    private void listen(NewInventoryEvent event) {

        log.debug("Got Inventory: " + event);

        beerInventoryRepository.save(BeerInventory.builder()
                        .beerId(event.getBeerDto().getId())
                        .upc(event.getBeerDto().getUpc())
                        .quantityOnHand(event.getBeerDto().getQuantityOnHand())
                        .build());
    }
}
