package be.khairul.huapii_test.models.question;

import lombok.Data;

import java.util.List;

@Data
public class SelectQuestion extends Question {

    private List<String> options;
    private boolean multipleSelect;

    public SelectQuestion() {
        this.setType(QuestionType.SELECT);
    }
}
