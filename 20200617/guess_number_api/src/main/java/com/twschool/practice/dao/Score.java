package com.twschool.practice.dao;

public class Score {
    private String userId;
    private int Score;

    public Score(String userId, int score) {
        this.userId = userId;
        Score = score;
    }

    public Score() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
