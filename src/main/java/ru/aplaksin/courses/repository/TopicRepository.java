package ru.aplaksin.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aplaksin.courses.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, String> {

}
