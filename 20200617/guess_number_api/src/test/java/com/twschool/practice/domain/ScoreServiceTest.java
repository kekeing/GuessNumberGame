package com.twschool.practice.domain;


import com.twschool.practice.dao.Score;
import com.twschool.practice.service.ScoreService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceTest {

//    @Autowired
//    private ScoreService scoreService;




    @Test
    public void should_add_to_old_score_array_when_given_user_1_old_score_array_exits_1(){
        ScoreService scoreService = new ScoreService();
        List<Score> oldScoreList = new ArrayList<>();
        Score oldScore = new Score("1",0,0);
        oldScoreList.add(oldScore);
       Score newScore = new Score("1",3);

       scoreService.getScoreWhenUserInGame(oldScoreList,newScore);

       int userResultScore = -1;

       for (Score afterHandleScore : oldScoreList){
           if (afterHandleScore.getUserId().equals(newScore.getUserId())){
               userResultScore = afterHandleScore.getScore();
           }
       }

        Assert.assertEquals(3,userResultScore);


    }
}
