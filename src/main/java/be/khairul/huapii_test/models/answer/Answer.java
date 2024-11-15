package be.khairul.huapii_test.models.answer;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Map;

@Data
public class Answer {
    @Id
    private String id;
    private String questionId;
    private Map<String, Object> response;
    private String comment;
}
