package ru.jenkl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.String.format;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 11.07.18
 */
@RunWith(Parameterized.class)
public class SimpleParameterizedTest {

    private final int i;

    @Parameterized.Parameters(name = "{index}: i = {0}")
    public static Collection<Integer> data() {
        return Arrays.asList(
            0, 1, 2, 3, 4, 5, 6
        );
    }

    public SimpleParameterizedTest(int i) {
        this.i = i;
    }

    @Test
    public void parameterizedTest() {
        Assert.assertTrue(format("%d not even number", i), i % 2 == 0);
    }
}
