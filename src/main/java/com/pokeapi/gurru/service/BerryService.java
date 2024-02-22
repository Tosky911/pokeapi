package com.pokeapi.gurru.service;

import com.pokeapi.gurru.model.Berry;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface BerryService {
    Mono<Berry> getBerryById(String id);
    Optional<Berry> getOptionalBerryById(String id);
}
