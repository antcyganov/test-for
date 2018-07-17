package ru.jenkl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 17.07.18
 */
public class RandomFailedTest {

    @Test
    public void testRandom() {
        int i = new Random().nextInt(100);
        Assert.assertTrue(i + " is not even", i%2 == 0);
    }

    @Test
    public void testRandom2() {
        int i = new Random().nextInt(100);
        Assert.assertTrue(i + " is even",i%2 != 0);
    }
}
