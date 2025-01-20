package com.challenge.forohub.persistence.repository;

import com.challenge.forohub.persistence.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

  List<Topic> findAllByUserId(Long userId);
}
