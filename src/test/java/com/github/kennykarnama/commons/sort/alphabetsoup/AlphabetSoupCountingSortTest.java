package com.github.kennykarnama.commons.sort.alphabetsoup;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlphabetSoupCountingSortTest {

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

        CountingSortAlphabetSoup sorter = new CountingSortAlphabetSoup();

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
