package ru.jenkl;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Integer.valueOf;
import static java.lang.String.format;

/**
 * @author Anton Tsyganov (jenkl)
 * @date 11.07.18
 */
@RunWith(Parameterized.class)
@Ignore
public class StringParameterizedTest {

    private final String i;

    @Parameterized.Parameters(name = "i = {0}")
    public static Collection<String> data() {
        return Arrays.asList(
            "0", "1", "2", "3", "4", "5", "6"
        );
    }

    public StringParameterizedTest(String i) {
        this.i = i;
    }

    @Test
    public void stringParameterizedTest() {
        Assert.assertTrue(format("%s is even number", i), valueOf(i) % 2 != 0);
    }
}
