package be.khairul.huapii_test.models.survey;

import be.khairul.huapii_test.models.answer.Answer;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "survey_answers")
public class SurveyAnswer {
    private String id;
    private String surveyId;
    private String userId;
    private List<Answer> answers;
    private String timestamp;
}
