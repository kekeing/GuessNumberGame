package com.twschool.practice.controller;

import com.twschool.practice.dao.Score;
import com.twschool.practice.service.GameService;
import com.twschool.practice.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    private static List<Score> oldScoreList = new ArrayList<>();

    @RequestMapping("/{userId}/game")
    public Map<String,String> guessGame(@RequestParam("guess") String input,
                                        @PathVariable("userId") String userId)
    {
        ScoreService scoreService = new ScoreService();
        Score score = new Score(userId,0);
        scoreService.getScoreWhenUserInGame(oldScoreList,score);
        int userScore = 0;

        for (Score oldScore : oldScoreList){
            if (oldScore.getUserId().equals(userId)){
                userScore = oldScore.getScore();
            }
        }

        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("input",input);
        resultMap.put("result",gameService.guess(input));
        resultMap.put("name",userId);
        resultMap.put("score",String.valueOf(userScore));
        return resultMap;
    }
}
