package com.example.artistgradle.repository;

import com.example.artistgradle.domain.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
    // 기본 CRUD 기능은 JpaRepository가 다 제공함
}
