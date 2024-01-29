package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("What is 34 + 50 ", 5, 84);
        Question q2 = new Question("What is 3 * 5", 5, 15);
        Question q3 = new Question("What is 50 / 10 ", 5, 5);
        Question q4 = new Question("What is 40 - 20 ", 5, 20);
        Question q5 = new Question("What is 3 + 5", 5, 8);
        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        int benchmark = 25;
        int studentScore = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.next();
        System.out.println(userInput);
        System.out.println("You're welcome " + userInput + "we hope this app is useful to you.");
        Collections.shuffle(questions);
        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println(currentQuestion.getText());
            int userAnswer = scanner.nextInt();

            if (userAnswer == currentQuestion.getAnswer()) {
                studentScore = studentScore + currentQuestion.getMarks();
            }
        }
        System.out.println("Your score is: " + studentScore + "/" + benchmark);


    }
}