package com.soniachalouah.coursemanagement.Contrôleurs;

import com.soniachalouah.coursemanagement.Entity.Cours;
import com.soniachalouah.coursemanagement.Services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    @Autowired
    private CoursService coursService;

    // Récupérer tous les cours
    @GetMapping("/getall")
    public List<Cours> getAllCourses() {
        return coursService.getAllCourses();
    }




    // Récupérer un cours par ID
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Cours> getCourseById(@PathVariable Long id) {
        Optional<Cours> cours = coursService.getCourseById(id);
        return cours.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Ajouter un cours
    @PostMapping("/add")
    public ResponseEntity<Cours> createCourse(@RequestParam("titre") String titre,
                                              @RequestParam("description") String description,
                                              @RequestParam("prix") Double prix,
                                              @RequestParam("image") MultipartFile image) throws IOException {

        // Validation des paramètres
        if (titre == null || titre.isEmpty() || description == null || description.isEmpty() || prix == null || image.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        Cours cours = new Cours();
        cours.setTitre(titre);
        cours.setDescription(description);
        cours.setPrix(prix);
        cours.setImage(image.getBytes()); // Assurez-vous que l'image est bien convertie

        Cours savedCourse = coursService.saveCourse(cours);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);
    }

    // Mettre à jour un cours
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCourse(
            @PathVariable Long id,
            @RequestParam("titre") String titre,
            @RequestParam("description") String description,
            @RequestParam("prix") Double prix,
            @RequestParam(value = "image", required = false) MultipartFile image
    ) {
        try {
            // Vérifiez si l'image est présente
            if (image != null && !image.isEmpty()) {
                // Gérer l'image (enregistrement, etc.)
            }
            // Mettez à jour le cours (titre, description, prix)
            return ResponseEntity.ok("Course updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    // Supprimer un cours
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        Optional<Cours> existingCourseOpt = coursService.getCourseById(id);
        if (existingCourseOpt.isPresent()) {
            coursService.deleteCourse(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}