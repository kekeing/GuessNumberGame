package com.twschool.practice.domain;


import com.twschool.practice.service.GameService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;


public class GameServiceTest {
    @Test
    public void should_return_4A0B_when_given_1234(){

        RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(new Answer(Arrays.asList(new String[]{"1","2","3","4"})));
        GameService gameService = new GameService();

        String result = gameService.guess("1 2 3 4");

        Assert.assertEquals("4A0B",result);
    }
}
