package be.khairul.huapii_test.services;

import be.khairul.huapii_test.models.survey.Survey;
import be.khairul.huapii_test.repository.SurveyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SurveyServiceImpl implements SurveyService {

    private final SurveyRepository surveyRepository;

    public Survey getById(String id) {
        return surveyRepository.findById(id).orElseThrow();
    }

    @Override
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }
}
