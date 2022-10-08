package com.github.kennykarnama;

import com.github.kennykarnama.cmd.AlphabetSoupCommand;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
  name = "personal-cli",
  description = "Collection of own cli tools",
  subcommands = {
    AlphabetSoupCommand.class,
  }
)
public class App implements Runnable
{
    public static void main(String[] args) {

        final CommandLine cmd = new CommandLine(new App());
        cmd.parseWithHandler(new CommandLine.RunLast(), args);
    }

    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }
}
