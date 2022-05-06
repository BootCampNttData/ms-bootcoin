package com.bootcamp.bootcoinwallet.producer;


import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class KafkaProducer {
  private static final String TRANSACTION_SALE = "TRANSACTION_SALE";
  private static final String TRANSACTION_PURCHASE = "TRANSACTION_PURCHASE";

  @Autowired
  @Qualifier("transactionTemplate")
  private KafkaTemplate<String, BootCoinTnx> transactionSaleTemplate;

  @Autowired
  @Qualifier("transactionTemplate")
  private KafkaTemplate<String, BootCoinTnx> transactionPurchaseTemplate;

  public void sendOperationSale(BootCoinTnx accountDto) {
    log.info("** realizando la transaccion de venta de coins " + accountDto.toString());
    transactionSaleTemplate.send(TRANSACTION_SALE, accountDto);
  }

  public void sendOperationPurchase(BootCoinTnx operationDto) {
    log.info("** realizando la transaccion de conpra de coins " + operationDto);
    transactionPurchaseTemplate.send(TRANSACTION_PURCHASE, operationDto);
  }
}
