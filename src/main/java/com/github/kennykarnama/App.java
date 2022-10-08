package com.github.kennykarnama;

import com.github.kennykarnama.cmd.AlphabetSoupCommand;

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
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void run() {
        System.out.println( "Hello World!" );
    }
}
