package com.soniachalouah.coursemanagement.Services;

import com.soniachalouah.coursemanagement.Entity.Cours;
import com.soniachalouah.coursemanagement.Repositories.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursServiceImpl implements CoursService {

    private final CoursRepository coursRepository;

    @Autowired
    public CoursServiceImpl(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public List<Cours> getAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Optional<Cours> getCourseById(Long id) {
        return coursRepository.findById(id);
    }

    @Override
    public Cours saveCourse(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void deleteCourse(Long id) {
        if (coursRepository.existsById(id)) {
            coursRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Cours avec cet ID n'existe pas");
        }
    }
}
