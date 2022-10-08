package com.github.kennykarnama.commons.sort.alphabetsoup;

/**
 * CountingSortAlphabetSoup
 * uses counting sort methods
 * because the input is assumed to be only alphabets
 * we allocate 123 (65 - 122) elements of array to store
 * each of alphabets counters
 * the weakness is not so efficient in memory allocation
 * but since it is quite small, I think it is acceptable
 * we could use hashmap, but we need to be careful since hashmap
 * could have O(n) worst case complexity during insert and get
 * complexity
 * time: O (Max_Character) 
 * Memory: O(1), since we always allocate 123 elements
 */
public class CountingSortAlphabetSoup extends AlphabetSoup {

    public CountingSortAlphabetSoup(String inputString) throws Exception {
        super(inputString);
    }

    @Override
    public String Process() {
        
        final int len = this.inputStr.length();
        int[] counts = new int[123];

        for (int i = 0; i < len; i++) {
            char c = this.inputStr.charAt(i);
            counts[(int)c]++;
        }

        StringBuffer buf = new StringBuffer();

        for (int i = 65; i < 123; i++) {
            for (int j = counts[i]; j > 0; j--) {
                buf.append((char) i);
            }
        }
        return buf.toString();
    }
    
}
