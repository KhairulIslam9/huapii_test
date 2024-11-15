package be.khairul.huapii_test.services;

import be.khairul.huapii_test.models.survey.Survey;

public interface SurveyService {
    Survey getById(String id);
    Survey save(Survey survey);
}
