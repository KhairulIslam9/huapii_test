package be.khairul.huapii_test.controllers;

import be.khairul.huapii_test.models.survey.SurveyAnswer;
import be.khairul.huapii_test.services.SurveyAnswerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("survey_answer")
@AllArgsConstructor
public class SurveyAnswerController {

    private final SurveyAnswerService surveyAnswerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SurveyAnswer create(@RequestBody SurveyAnswer surveyAnswer) {
        return surveyAnswerService.save(surveyAnswer);
    }

    @GetMapping("/user/{userId}")
    public List<SurveyAnswer> getAllByUserId(@PathVariable String userId) {
        return surveyAnswerService.findAllByUserId(userId);
    }
}
