package ru.aplaksin.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aplaksin.courses.model.Course;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> findByName(String name);
    List<Course> findByDescription(String description);

    List<Course> findByTopicId(String topicId);
}
