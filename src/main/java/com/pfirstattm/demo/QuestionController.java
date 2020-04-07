package com.pfirstattm.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class QuestionController {

    @Autowired
    private QuestionRepository qRes;

    @GetMapping("/questions")
    public List<YesNoQuestion> getAllYesNoQuestions(){
        return qRes.findAll();
    }
}
