package com.example.artistgradle.service;

import com.example.artistgradle.domain.purchase.PurchaseRequest;
import com.example.artistgradle.repository.PurchaseRequestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseRequestService {

    private final PurchaseRequestRepository repository;

    public PurchaseRequestService(PurchaseRequestRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public PurchaseRequest saveRequest(PurchaseRequest request) {
        return repository.save(request);
    }
}
