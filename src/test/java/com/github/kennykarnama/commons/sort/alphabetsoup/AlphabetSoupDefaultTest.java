package com.github.kennykarnama.commons.sort.alphabetsoup;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlphabetSoupDefaultTest {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldSortedAscending() throws Exception
    {
        String[] inputs = {
            "coderbyte",
            "hooplah",
            "BbbAAaCC",
        };
        String[] expectedOutputs = {
            "bcdeeorty",
            "ahhloop",
            "AABCCabb"
        };

        final int lenTest = inputs.length;

        DefaultAlphabetSoup sorter = new DefaultAlphabetSoup();

        for (int testNumber = 0; testNumber < lenTest; testNumber++) {
            String input = inputs[testNumber];
            String expectedOutput = expectedOutputs[testNumber];
            String actual = sorter.Process(input);
            assertEquals(expectedOutput, actual);
        }
    }

    @Test
    public void shouldThrowException() throws Exception {
        CountingSortAlphabetSoup sorter = new CountingSortAlphabetSoup();
        exception.expect(Exception.class);
        sorter.Process("123abc");
    }
}
