package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyserMood("This is a sad message");
        Assertions.assertEquals(mood,"SAD");

    }
}
