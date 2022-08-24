package org.DataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SentimentAnalysisTest {

    @Test
    void isNegative() {
        Assertions.assertEquals(SentimentAnalysis.sentimental("The world is a terrible place to live in"), "NEGATIVE");
    }

    @Test
    void isPositive() {
        Assertions.assertEquals(SentimentAnalysis.sentimental("Today I saw a bunch of beautiful butterflies and they all looked so happy! All except for one that looked a bit sad and lonely"),"POSITIVE");
    }

    @Test
    void isNeutral() {
        Assertions.assertEquals(SentimentAnalysis.sentimental(" I'm going shopping and I'm super excited. The terrible thing is that the boots I wanted are no longer in sale, which makes me a bit angry, because I now have to pay full price."),"NEUTRAL");
    }
}