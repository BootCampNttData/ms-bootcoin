package com.bootcamp.bootcoinwallet.service;


import com.bootcamp.bootcoinwallet.model.WalletOwner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WalletOwnerService {

    Flux<WalletOwner> findAll();
    Mono<WalletOwner> findByClientId(String num);
    Mono<WalletOwner> create(WalletOwner walletOwner);

    Mono<WalletOwner> update(WalletOwner walletOwner);
    Mono<Void> deleteById(String id);
}
