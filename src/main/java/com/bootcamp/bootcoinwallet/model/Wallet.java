package com.bootcamp.bootcoinwallet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class Wallet {
    @Id
    private String  dex;
    private String  clientId;
    private String  amount;
    private String  tnxType;
    private Date tnxDate;
}
