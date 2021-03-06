package com.example.springsecurity.repository;

import com.example.springsecurity.models.AnnotationAnswers;
import com.example.springsecurity.models.Annotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AnnotationAnswersRepository extends JpaRepository<AnnotationAnswers, Long> {

    @Transactional
    Optional<AnnotationAnswers> findById(UUID annotationAnswersId);

    @Transactional
    List<AnnotationAnswers> findAllById(UUID id);

    @Transactional
    List<AnnotationAnswers> findAll();

    @Transactional
    @Modifying
    void deleteById(UUID annotationAnswersId);

    Boolean existsById(UUID annotationAnswersId);
}
