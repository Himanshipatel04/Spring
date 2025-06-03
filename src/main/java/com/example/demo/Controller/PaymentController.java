package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.PaymentRequest;
import com.example.demo.DTO.PaymentResponse;
import com.example.demo.Service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id) {
        System.out.println(id);
        // Map incoming request to DTO
        PaymentRequest internalReqObj = new PaymentRequest();
        internalReqObj.setPaymentId(id);

        PaymentResponse payment = paymentService.getPaymentDetailsById(internalReqObj);

        return ResponseEntity.ok(payment);
    }
}
