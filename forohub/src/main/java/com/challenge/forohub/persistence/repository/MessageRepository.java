package com.challenge.forohub.persistence.repository;

import com.challenge.forohub.persistence.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

  List<Message> findAllByTopicId(Long topicId);

  List<Message> findAllByUserId(Long userId);
}
