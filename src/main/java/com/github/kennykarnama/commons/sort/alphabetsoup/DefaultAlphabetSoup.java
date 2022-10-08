package com.github.kennykarnama.commons.sort.alphabetsoup;

/**
 * DefaultAlhabetSoup uses bubble sort 
 * I use this since the length of string is unknown
 * and for small test cases it should be fine
 */
public class DefaultAlphabetSoup extends AlphabetSoup {

    @Override
    public String Process(String s) throws Exception {
        // validate
        // should be done in constructor, but let it be like this
        this.Validate(s);
        // Allocate char arrays so we can
        // modify in place since string is immutable 
        char arr[] = s.toCharArray();
        // store length of the string array
        // to avoid re-computation during loops
        final int len = arr.length;
        char temp;
        int i = 0;
        while (i < len) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return new String(arr);
    } 
}
