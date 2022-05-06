package com.bootcamp.bootcoinwallet.service;

import com.bootcamp.bootcoinwallet.model.Wallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WalletService{
    Flux<Wallet> findAll();
    Mono<Wallet> findByDexNumber(String num);
    Mono<Wallet> create(Wallet wallet);
    Mono<Wallet> update(Wallet wallet);
    Mono<Void> deleteById(String id);
}
