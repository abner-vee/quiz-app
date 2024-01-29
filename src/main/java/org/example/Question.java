package org.example;

public class Question {
     private String text;
     private int marks;
     private int answer;

    public Question(String text, int marks, int answer) {
        this.text = text;
        this.marks = marks;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}