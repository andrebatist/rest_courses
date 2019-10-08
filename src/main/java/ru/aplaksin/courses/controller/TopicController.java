package ru.aplaksin.courses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aplaksin.courses.model.Topic;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "Spring Framework Description"));
    }
}
