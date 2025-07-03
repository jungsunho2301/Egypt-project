package com.example.artistgradle.repository;

import com.example.artistgradle.domain.purchase.PurchaseRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestRepository extends JpaRepository<PurchaseRequest, Long> {
    // 기본 CRUD 가능
}
