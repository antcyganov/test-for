package ru.jenkl;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 04.07.18
 */
public class SimpleTest {
    @Test
    public void shouldFinishedSuccess() {

    }

    @Test
    public void shouldFinishedSuccess2() {

    }

    @Test
    @Ignore
    public void shouldBeFailed() {
        Assert.fail();
    }

    @Test
    @Ignore
    public void shouldBeBroken() {
        throw new RuntimeException();
    }
}
