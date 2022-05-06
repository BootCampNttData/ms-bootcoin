package com.bootcamp.bootcoinwallet.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class KafkaConsumer {
  private static final String CONFIRMATION_SALE = "CONFIRMATION_SALE";
  private static final String CONFIRMATION_PURCHASE = "CONFIRMATION_PURCHASE";

  @Autowired
  @KafkaListener(topics = CONFIRMATION_SALE, groupId = "group_id")
  public void comsumerConfirmationSale(String message) {
    log.info("Confirmar registro de venta" + message);
  }

  @KafkaListener(topics =  CONFIRMATION_PURCHASE, groupId = "group_id")
  public void comsumerConfirmationPurchase(String message) {
    log.info("Confirmar registro de compra" + message);
  }
}
