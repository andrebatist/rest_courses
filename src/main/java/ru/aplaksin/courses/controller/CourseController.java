package ru.aplaksin.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.aplaksin.courses.model.Course;
import ru.aplaksin.courses.service.CourseService;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{topicId}/topic")
    public List<Course> getAllCoursesByTopicId(@PathVariable String topicId) {
        return courseService.getAllCoursesByTopicId(topicId);
    }

    @PostMapping("/courses/{topicId}")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        courseService.addTopicToCourse(course, topicId);
        courseService.updateCourse(course);
    }

    @PutMapping("/courses/{topicId}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
        courseService.addTopicToCourse(course, topicId);
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteTopic(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
