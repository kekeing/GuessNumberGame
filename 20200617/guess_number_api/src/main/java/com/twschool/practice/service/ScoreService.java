package com.twschool.practice.service;


import com.twschool.practice.dao.Score;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    public void getScoreWhenUserInGame(List<Score> oldScoreList,Score score){
        boolean exits = false;
        for (Score oldScore : oldScoreList){
            if (score.getUserId().equals(oldScore.getUserId())){
                exits = true;
                oldScore.addScore(score.getScore());
                break;
            }
        }
        if (!exits){
            score.setWinSeriesTimes(0);
            oldScoreList.add(score);
        }
    }
}
