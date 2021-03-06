package ru.jenkl.random;

import com.google.code.tempusfugit.concurrency.IntermittentTestRunner;
import com.google.code.tempusfugit.concurrency.annotations.Intermittent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 17.07.18
 */
@Intermittent
@RunWith(IntermittentTestRunner.class)
public class RandomFailedTest {

    @Test
    public void testRandom() {
        int i = new Random().nextInt(100);
        System.out.println("*** random i in testRandom is " + i);
        Assert.assertTrue(i + " is not even", i%2 == 0);
    }

    @Test
    public void testRandom2() {
        int i = new Random().nextInt(100);
        System.out.println("*** random i in testRandom2 is " + i);
        Assert.assertTrue(i + " is even",i%2 != 0);
    }
}
