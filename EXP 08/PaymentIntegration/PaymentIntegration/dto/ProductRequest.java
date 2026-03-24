package com.example.PaymentIntegration.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductRequest {
    private Long amount;
    private Long quantity;
    private String name;
    private String currency;
}
