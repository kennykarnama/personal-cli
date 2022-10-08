package com.github.kennykarnama.cmd;

import com.github.kennykarnama.commons.sort.alphabetsoup.CountingSortAlphabetSoup;
import com.github.kennykarnama.commons.sort.alphabetsoup.DefaultAlphabetSoup;
import com.github.kennykarnama.commons.sort.alphabetsoup.AlphabetSoup;

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
                AlphabetSoup sorter;
                try {
                    sorter = new CountingSortAlphabetSoup(this.inputStr);
                    result = sorter.Process();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                break;
            default:
                try {
                    sorter = new DefaultAlphabetSoup(this.inputStr);
                    result = sorter.Process();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(result);
    }
}
