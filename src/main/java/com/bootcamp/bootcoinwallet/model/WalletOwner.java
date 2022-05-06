package com.bootcamp.bootcoinwallet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class WalletOwner {
    @Id
    private String  id;
    private String  name;
    private String  lastName;
    private String  clientId;
    private String  documentType;
    private String  dex;
    private String  cellPhone;
    private String  email;
}
