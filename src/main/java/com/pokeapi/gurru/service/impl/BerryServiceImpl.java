package com.pokeapi.gurru.service.impl;

import com.pokeapi.gurru.client.PokeApiWebClient;
import com.pokeapi.gurru.model.Berry;
import com.pokeapi.gurru.service.BerryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BerryServiceImpl implements BerryService {

    private final PokeApiWebClient pokeApiWebClient;

    @Override
    public Mono<Berry> getBerryById(String id) {
        log.info("<<<< Service:: getting Berry By Id: {} >>>>", id);

//        1. Get values from poke api
        Mono<Berry> clientResponse= pokeApiWebClient.getBerryById(id);
//        2. Save the values using postgress


//        3. Return values from DB to controller
        return null;
    }

    @Override
    public Optional<Berry> getOptionalBerryById(String id) {
        return Optional.empty();
    }
}
