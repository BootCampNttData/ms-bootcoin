package com.bootcamp.bootcoinwallet.controller;

import com.bootcamp.bootcoinwallet.model.WalletOwner;

import com.bootcamp.retailclient.util.Constants;
import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/walletowner")
@RequiredArgsConstructor
public class BootCoinController {
    private final Constants constants;
//    public final BootCoinService service;
//    Logger logger = LoggerFactory.getLogger(BootCoinController.class);

//    @GetMapping
//    public Flux<WalletOwner> getAll(){
//        logger.info("***********  Test *************");
//        return service.findAll();
//    }
//
//    @GetMapping("/find/{document}")
//    public Flux<WalletOwner> findByDocumentId(@PathVariable("document") String document){
//        return service.getByDocumentId(document);
//    }
//
//    @PostMapping
//    public Mono<WalletOwner> create(@RequestBody WalletOwner walletOwner){
//        return service.create(walletOwner);
//    }
//
//    @PostMapping("/update")
//    public Mono<WalletOwner> update(@RequestBody WalletOwner walletOwner){
//        return service.create(walletOwner);
//    }
//
//    @DeleteMapping
//    public Mono<WalletOwner> delete(@RequestBody WalletOwner walletOwner){
//        return service.delete(walletOwner);
//    }
//
//    @DeleteMapping("/byId/{id}")
//    public Mono<WalletOwner> deleteById(@RequestBody String id){
//        return service.deleteById(id);
//    }
//
//    @GetMapping("/getProducts/{idClient}")
//    public Flux<ProductsReport> getProducts(@PathVariable("idClient") String idClient){
//
//
//        return Flux.merge(savingAccounts,currentAccounts,fixedDepositAccounts,creditCards,credits);
//    }

}
