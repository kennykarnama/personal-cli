package com.github.kennykarnama.commons.sort.alphabetsoup;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlphabetSoupTest {

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

        for (int testNumber = 0; testNumber < lenTest; testNumber++) {
            String input = inputs[testNumber];
            String expectedOutput = expectedOutputs[testNumber];
            AlphabetSoup sorter = new CountingSortAlphabetSoup(input);
            AlphabetSoup defaultSorter = new DefaultAlphabetSoup(input);
            String actual = sorter.Process();
            assertEquals(expectedOutput, actual);
            String defaultActual = defaultSorter.Process();
            assertEquals(expectedOutput, defaultActual);
        }
    }

    @Test
    public void shouldThrowException() throws Exception {
        exception.expect(Exception.class);
        new CountingSortAlphabetSoup("123abc");
    }
}
