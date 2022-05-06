package com.bootcamp.bootcoinwallet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class BootCoinTnx {
    @Id
    private String  id;
    private String  clientId;
    private String  tnxNumber;
    private String  tnxType;        /** [B]Buy or [S]Sell Cryto */
    private String  tnxStatus;      /** [P]process [D]Deny [A]Approbe */
    private Date tnxDate;
}
