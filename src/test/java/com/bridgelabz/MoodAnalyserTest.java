package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void message_IsSad_returnSad() {
        String mood = moodAnalyser.analyseMood("I am Sad Mood");
        Assertions.assertEquals("Sad", mood);
    }

}
