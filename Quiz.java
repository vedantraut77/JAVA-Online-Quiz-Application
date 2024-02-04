package JavaProject1;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
            displayMultipleChoiceOptions(currentQuestion);

            System.out.print("Enter your answer (1-" + currentQuestion.getOptions().size() + "): ");
            int userChoice = scanner.nextInt();

            checkAnswer(currentQuestion, userChoice);
        }

        int totalQuestions = questions.size();
        double percentageScore = (double) score / totalQuestions * 100;

        System.out.println("Quiz completed! Your score: " + score + "/" + totalQuestions);
        System.out.println("Percentage Score: " + percentageScore + "%");
    }

    private void displayMultipleChoiceOptions(Question question) {
        List<String> options = question.getOptions();
        for (int j = 0; j < options.size(); j++) {
            System.out.println((j + 1) + ". " + options.get(j));
        }
    }

    private void checkAnswer(Question question, int userChoice) {
        if (userChoice == question.getCorrectOptionIndex() + 1) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + (question.getCorrectOptionIndex() + 1) + "\n");
        }
    }
}
