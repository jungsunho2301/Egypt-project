package com.example.artistgradle.domain.purchase;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "purchase_requests")
public class PurchaseRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artworkId;  // 작품 아이디 또는 이름

    private String requesterName;

    private String requesterEmail;

    private String requesterPhone;

    @Column(length = 1000)
    private String message;

    private LocalDateTime requestDate;

    public PurchaseRequest() {
        this.requestDate = LocalDateTime.now();
    }

    // getters, setters
    // ...
}
