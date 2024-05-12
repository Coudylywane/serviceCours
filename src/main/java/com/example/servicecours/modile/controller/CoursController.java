package com.example.servicecours.modile.controller;

import com.example.servicecours.data.entity.Cours;
import com.example.servicecours.data.enums.CoursStatus;
import com.example.servicecours.services.interfaces.ICoursService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/cours")
@RestController
@Tag(name = "Cours", description = "Cours API")
public class CoursController {
    private final ICoursService coursService;

    @PostMapping("")
    public Cours saveCourse(Cours cours)  {
        return this.coursService.saveCours(cours);
    }

    @GetMapping()
    public List<Cours> getCourses()  {
        return this.coursService.getAllCours();
    }

    @GetMapping("/status/{status}")
    public List<Cours> getCoursesByStatus(@PathVariable CoursStatus status)  {
        return this.coursService.getCoursByStatus(status);
    }

    @GetMapping("/{id}")
    public Cours getCourseById(@PathVariable Long id)  {
        return this.coursService.getCoursById(id);
    }


}
