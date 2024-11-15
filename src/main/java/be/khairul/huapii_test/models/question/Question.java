package be.khairul.huapii_test.models.question;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SelectQuestion.class, name = "SELECT"),
        @JsonSubTypes.Type(value = CommentQuestion.class, name = "COMMENT")
})
public abstract class Question {
    @Id
    private String id;
    private QuestionType type;
    private String title;
    private String commentEnabled;
    private String commentPlaceholder;
    private int order;
}
