package com.bootcamp.bootcoinwallet.repository;

import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface WalletOwnerRepository extends ReactiveCrudRepository<BootCoinTnx, String> {
    Flux<BootCoinTnx> findByClientId(String id);
}
