package be.khairul.huapii_test.repository;

import be.khairul.huapii_test.models.survey.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends MongoRepository<Survey, String> {
}
