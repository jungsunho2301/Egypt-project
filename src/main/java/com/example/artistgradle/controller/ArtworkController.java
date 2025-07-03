package com.example.artistgradle.controller;

import com.example.artistgradle.domain.Artwork;
import com.example.artistgradle.repository.ArtworkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artworks")
public class ArtworkController {

    private final ArtworkRepository artworkRepository;

    public ArtworkController(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    // 전체 작품 목록 조회
    @GetMapping
    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    // 작품 등록
    @PostMapping
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    // 작품 하나 조회
    @GetMapping("/{id}")
    public Artwork getArtworkById(@PathVariable Long id) {
        return artworkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artwork not found with id " + id));
    }
}
