package com.bootcamp.bootcoinwallet.repository;

import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BootCoinTnxRepository extends ReactiveCrudRepository<BootCoinTnx, String> {
    Flux<BootCoinTnx> findByTnxNumber(String num);
}
