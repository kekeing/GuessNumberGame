package com.twschool.practice.controller;

import com.twschool.practice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;


    @RequestMapping("/game")
    public Map<String,String> guessGame(@RequestParam("guess") String input){
        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("input",input);
        resultMap.put("result",gameService.guess(input));
        return resultMap;
    }
}
