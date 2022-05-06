package com.bootcamp.bootcoinwallet.service.Impl;

import com.bootcamp.bootcoinwallet.model.WalletOwner;
import com.bootcamp.bootcoinwallet.service.WalletOwnerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WalletOwnerServiceImpl implements WalletOwnerService {

  @Override
  public Flux<WalletOwner> findAll() {
    return null;
  }

  @Override
  public Mono<WalletOwner> findByClientId(String num) {
    return null;
  }

  @Override
  public Mono<WalletOwner> create(WalletOwner walletOwner) {
    return null;
  }

  @Override
  public Mono<WalletOwner> update(WalletOwner walletOwner) {
    return null;
  }

  @Override
  public Mono<Void> deleteById(String id) {
    return null;
  }
}
