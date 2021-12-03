package com.example.customerserviceapp.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    @Id
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private Address address;


}
