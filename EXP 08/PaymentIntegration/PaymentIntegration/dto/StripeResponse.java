package com.example.PaymentIntegration.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StripeResponse {
    private String message;
    private String status;
    private  String sessionId;
    private String sessionUrl;
}
