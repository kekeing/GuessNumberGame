package com.twschool.practice.controller;

import com.twschool.practice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;


    @RequestMapping("/{userId}/game")
    public Map<String,String> guessGame(@RequestParam("guess") String input,
                                        @PathVariable("userId") String userId)
    {
        Map<String,String> resultMap = new HashMap<>();

        resultMap.put("input",input);
        resultMap.put("result",gameService.guess(input));
        return resultMap;
    }
}
