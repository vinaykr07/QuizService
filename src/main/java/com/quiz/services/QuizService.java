package com.quiz.services;

import com.quiz.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {

    Quiz add(Quiz quiz);
    List<Quiz> getALl();
    Quiz get(Long id);
}
