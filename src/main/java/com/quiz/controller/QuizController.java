package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping("/get")
    public List<Quiz> getAll(){
        return quizService.getALl();
    }

    @GetMapping("/get/{id}")
    public Quiz getAll(@PathVariable Long id){
        return quizService.get(id);
    }
}
