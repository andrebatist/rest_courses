package ru.aplaksin.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aplaksin.courses.model.Course;
import ru.aplaksin.courses.model.Topic;
import ru.aplaksin.courses.repository.CourseRepository;
import ru.aplaksin.courses.repository.TopicRepository;

import java.util.List;
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TopicRepository topicRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void addTopicToCourse(Course course, String topicId) {
        Topic topic = topicRepository.findById(topicId).orElse(null);
        if (topic!= null) {
            course.setTopic(topic);
        }
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
