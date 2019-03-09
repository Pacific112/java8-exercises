package _3_optional._2_exercise;

import java.util.Optional;

public class Essay {

    private String topic;
    private Integer grade;

    public Optional<Integer> getGrade() {
        return Optional.ofNullable(grade);
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
