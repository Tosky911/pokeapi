package com.pokeapi.gurru.client;

import com.pokeapi.gurru.model.Berry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class PokeApiWebClient {

    public Mono<Berry> getBerryById(String id){
        WebClient client = WebClient.create("https://pokeapi.co");

        return client
                .get()
                .uri("/api/v2/berry/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Berry.class);
    }

}
