package com.github.kennykarnama.cmd;

import com.github.kennykarnama.commons.sort.alphabetsoup.CountingSortAlphabetSoup;
import com.github.kennykarnama.commons.sort.alphabetsoup.DefaultAlphabetSoup;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "alphabet-soup", description = "sort alphabetically")
public class AlphabetSoupCommand implements Runnable {

    @Option(names = { "--input-str" }, required = true)
    private String inputStr;

    @Option(names = { "-m", "--mode" }, description = "Sort mode, DEFAULT (use bubble sort), COUNTING_SORT")
    private String mode = "DEFAULT";

    @Override
    public void run() {
        String result = "";
        switch (this.mode) {
            case "COUNTING_SORT":
                CountingSortAlphabetSoup sorter = new CountingSortAlphabetSoup();
                try {
                    result = sorter.Process(this.inputStr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                DefaultAlphabetSoup defaultSorter = new DefaultAlphabetSoup();
                try {
                    result = defaultSorter.Process(this.inputStr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(result);
    }
}
