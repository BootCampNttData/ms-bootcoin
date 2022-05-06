package com.bootcamp.bootcoinwallet.service.Impl;

import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import com.bootcamp.bootcoinwallet.producer.KafkaProducer;
import com.bootcamp.bootcoinwallet.repository.BootCoinTnxRepository;
import com.bootcamp.bootcoinwallet.repository.WalletOwnerRepository;
import com.bootcamp.bootcoinwallet.repository.WalletRepository;
import com.bootcamp.bootcoinwallet.service.BootCoinTnxService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BootCoinTnxServiceImpl implements BootCoinTnxService {

  @Override
  public Flux<BootCoinTnx> findAll() {
    return null;
  }

  @Override
  public Mono<BootCoinTnx> findByTnxNumber(String num) {
    return null;
  }

  @Override
  public Mono<BootCoinTnx> create(BootCoinTnx businessClient) {
    return null;
  }

  @Override
  public Mono<BootCoinTnx> update(BootCoinTnx businessClient) {
    return null;
  }

  @Override
  public Mono<Void> deleteById(String id) {
    return null;
  }
}
