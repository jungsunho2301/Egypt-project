package com.example.artistgradle.controller;

import com.example.artistgradle.domain.purchase.PurchaseRequest;
import com.example.artistgradle.service.PurchaseRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchase-requests")
public class PurchaseRequestController {

    private final PurchaseRequestService service;

    public PurchaseRequestController(PurchaseRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> createPurchaseRequest(@RequestBody PurchaseRequest request) {
        PurchaseRequest saved = service.saveRequest(request);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
