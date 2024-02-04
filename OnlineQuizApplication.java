package JavaProject1;

import java.util.ArrayList;
import java.util.List;

public class OnlineQuizApplication {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of Canada?",
                List.of("Toronto", "Ottawa", "Vancouver", "Montreal"), 1));

        questions.add(new Question("Which programming language is known for its portability?",
                List.of("Java", "C", "Python", "JavaScript"), 0));

        question.add(new Question("Who is the God of Underworld according top greek mythology?",
                List.of("Persephona", "Hades", "Zeus", "Posidsen"), 1));

        Quiz quiz = new Quiz(questions);

        quiz.startQuiz();
    }
}
