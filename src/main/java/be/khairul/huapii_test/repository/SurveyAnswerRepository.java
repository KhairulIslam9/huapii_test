package be.khairul.huapii_test.repository;

import be.khairul.huapii_test.models.survey.SurveyAnswer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyAnswerRepository extends MongoRepository<SurveyAnswer, String> {
    List<SurveyAnswer> findAllByUserId(final String userId);
    SurveyAnswer findFirstByUserIdOrderByTimestampDesc(final String userId);
}
