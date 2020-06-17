package com.twschool.practice.domain;

import com.twschool.practice.dao.Score;
import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {
    @Test
    public void should_get_correct_score_3_when_given_score_0_and_userId(){
        Score score = new Score("like",0);

        score.addScore(3);

        Assert.assertEquals(3,score.getScore());
    }
}
