package com.twschool.practice.dao;

public class Score {
    private String userId;
    private int score;

    public void addScore(int score){
        this.score += score;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Score(String userId, int score) {
        this.userId = userId;
        this.score = score;
    }

    public Score() {
    }
}
