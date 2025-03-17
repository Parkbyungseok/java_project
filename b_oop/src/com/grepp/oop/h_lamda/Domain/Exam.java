package com.grepp.oop.h_lamda.Domain;

import com.grepp.oop.h_lamda.function.Predicate;

public class Exam {

    private String subject;
    private String name;
    private int score;

    public Exam(String subject, String name, int score) {
        this.subject = subject;
        this.name = name;
        this.score = score;
    }

    public boolean isPass(Predicate<Exam> p){
        return p.test(this);
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" +
            "subject='" + subject + '\'' +
            ", name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
