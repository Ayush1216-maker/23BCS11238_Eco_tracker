package com.example.PaymentIntegration.controller;

import com.example.PaymentIntegration.dto.ProductRequest;
import com.example.PaymentIntegration.dto.StripeResponse;
import com.example.PaymentIntegration.service.StripeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/product/v1")
public class ProductController {
    private StripeService stripeService;

    public ProductController(StripeService stripeService){
        this.stripeService=stripeService;
    }
    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse>checkoutproduct(@RequestBody ProductRequest productRequest)
    {
        StripeResponse stripeResponse= stripeService.checkoutproduct(productRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(stripeResponse);
    }
    @GetMapping("/")
    public String home() {
        return "checkout"; // loads checkout.html
    }
}
