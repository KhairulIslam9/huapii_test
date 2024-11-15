package be.khairul.huapii_test.models.question;

import lombok.Data;

@Data
public class CommentQuestion extends Question {

    private String placeholder;

    public CommentQuestion() {
        this.setType(QuestionType.COMMENT);
    }
}
