package com.bootcamp.bootcoinwallet.service;

import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootCoinTnxService{

    Flux<BootCoinTnx> findAll();
    Mono<BootCoinTnx> findByTnxNumber(String num);
    Mono<BootCoinTnx> create(BootCoinTnx businessClient);

    Mono<BootCoinTnx> update(BootCoinTnx businessClient);
    Mono<Void> deleteById(String id);

}
