package ru.jenkl;

import com.google.code.tempusfugit.concurrency.IntermittentTestRunner;
import com.google.code.tempusfugit.concurrency.annotations.Intermittent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 04.07.18
 */
@RunWith(IntermittentTestRunner.class)
public class SimpleTest {
    @Test
    public void shouldFinishedSuccess() {

    }

    @Test
    public void shouldFinishedSuccess2() {

    }

    @Test
    @Intermittent(repetition = 2)
    public void shouldBeFailed() {
        Assert.fail("Fail test");
    }

    @Test
    @Intermittent(repetition = 2)
    public void shouldBeBroken() {
        throw new RuntimeException("Broken test");
    }

    @Test
    public void testWithLongErrorMessage() {
        Assert.fail("Very long message!Very long message!Very long message!Very long message!Very long message!" +
            "Very long message!Very long message!Very long message!Very long message!Very long message!" +
            "Very long message!Very long message!Very long message!Very long message!Very long message!" +
            "Very long message!Very long message!Very long message!Very long message!Very long message!" +
            "Very long message!Very long message!Very long message!Very long message!Very long message!" +
            "Very long message!Very long message!Very long message!Very long message!Very long message!");
    }
}
