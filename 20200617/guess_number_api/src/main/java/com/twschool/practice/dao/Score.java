package com.twschool.practice.dao;

public class Score {
    private String userId;
    private int score;
    private int winSeriesTimes;

    public Score(String userId, int score, int winSeriesTimes) {
        this.userId = userId;
        this.score = score;
        this.winSeriesTimes = winSeriesTimes;
    }

    public int getWinSeriesTimes() {
        return winSeriesTimes;
    }

    public void setWinSeriesTimes(int winSeriesTimes) {
        this.winSeriesTimes = winSeriesTimes;
    }

    public void addScore(int score){
        if (score == 3) {
            if (this.winSeriesTimes  > 3){
                this.score += 2;
            }
            if (this.winSeriesTimes  > 5){
                this.score += 3;
            }
            this.score += score;
            this.winSeriesTimes++;
        }
        else if (score < 0){
            this.score += score;
            this.winSeriesTimes = 0;
        }else {
            this.score += score;
        }

    }
    public void deleteScore(int score){
        this.score = this.score - score;
        winSeriesTimes = 0;
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
