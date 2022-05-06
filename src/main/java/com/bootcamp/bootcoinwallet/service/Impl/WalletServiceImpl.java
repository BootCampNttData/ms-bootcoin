package com.bootcamp.bootcoinwallet.service.Impl;
import com.bootcamp.bootcoinwallet.model.Wallet;
import com.bootcamp.bootcoinwallet.repository.WalletRepository;

import com.bootcamp.bootcoinwallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WalletServiceImpl implements WalletService {
  @Autowired
  private WalletRepository walletRepository;

  @Override
  public Flux<Wallet> findAll() {
    return walletRepository.findAll();
  }

  @Override
  public Mono<Wallet> findByDexNumber(String num) {
    return walletRepository.findByTnxNumber(num);
  }

  @Override
  public Mono<Wallet> create(Wallet wallet) {
    return walletRepository.save(wallet);

  }

  @Override
  public Mono<Wallet> update(Wallet wallet) {
    return walletRepository.save(wallet);
  }

  @Override
  public Mono<Void> deleteById(String id) {
    return walletRepository.deleteById(id);
  }

}
