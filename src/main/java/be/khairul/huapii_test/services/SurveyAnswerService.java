package be.khairul.huapii_test.services;

import be.khairul.huapii_test.models.survey.SurveyAnswer;

import java.util.List;

public interface SurveyAnswerService {
    SurveyAnswer save(SurveyAnswer surveyAnswer);
    SurveyAnswer findLastByUserId(String userId);
    List<SurveyAnswer> findAllByUserId(String userId);
}
