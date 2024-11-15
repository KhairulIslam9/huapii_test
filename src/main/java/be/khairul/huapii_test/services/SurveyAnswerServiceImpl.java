package be.khairul.huapii_test.services;

import be.khairul.huapii_test.models.survey.SurveyAnswer;
import be.khairul.huapii_test.repository.SurveyAnswerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SurveyAnswerServiceImpl implements SurveyAnswerService {

    private final SurveyAnswerRepository surveyAnswerRepository;

    public SurveyAnswer save(SurveyAnswer surveyAnswer) {
        return surveyAnswerRepository.save(surveyAnswer);
    }

    public SurveyAnswer findLastByUserId(String userId) {
        return surveyAnswerRepository.findFirstByUserIdOrderByTimestampDesc(userId);
    }

    public List<SurveyAnswer> findAllByUserId(String userId) {
        return surveyAnswerRepository.findAllByUserId(userId);
    }
}
