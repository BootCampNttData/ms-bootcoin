package com.bootcamp.bootcoinwallet.repository;

import com.bootcamp.bootcoinwallet.model.Wallet;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WalletRepository extends ReactiveCrudRepository<Wallet, String> {
    Mono<Wallet> findByTnxNumber(String num);
}
