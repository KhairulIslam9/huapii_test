package be.khairul.huapii_test.controllers;

import be.khairul.huapii_test.models.survey.Survey;
import be.khairul.huapii_test.services.SurveyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("survey")
@AllArgsConstructor
public class SurveyController {

    private final SurveyService surveyService;

    @GetMapping("/{id}")
    // TODO Could return SurveyAnswer to facilitate front end dev (with a mapper)
    public Survey getSurvey(@PathVariable String id) {
        return surveyService.getById(id);
    }

    @PostMapping
    public Survey create(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }

    @PutMapping
    //TODO Add spring security
//    @PreAuthorize("hasRole('ADMIN')")
    public Survey update(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }
}
