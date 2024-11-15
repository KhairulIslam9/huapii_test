package be.khairul.huapii_test.models.survey;

import be.khairul.huapii_test.models.question.Question;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "surveys")
public class Survey {
    @Id
    private String id;
    private String title;
    private List<Question> questions;
}
