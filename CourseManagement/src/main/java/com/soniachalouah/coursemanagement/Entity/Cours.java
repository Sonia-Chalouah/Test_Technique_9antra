package com.soniachalouah.coursemanagement.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private Double prix;

    @Lob  // Utilisé pour les fichiers de type Blob (Binaire)
    private byte[] image;
}
