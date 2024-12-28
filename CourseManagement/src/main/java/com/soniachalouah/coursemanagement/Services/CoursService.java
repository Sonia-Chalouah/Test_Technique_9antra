package com.soniachalouah.coursemanagement.Services;

import com.soniachalouah.coursemanagement.Entity.Cours;

import java.util.List;
import java.util.Optional;

public interface CoursService {

    List<Cours> getAllCourses();

    Optional<Cours> getCourseById(Long id);

    Cours saveCourse(Cours cours);

    void deleteCourse(Long id);
}
