## personal-cli

Simple cli using java

## Tech stacks

- Maven
- Java
- picocli

## Commands

To see all the commands, run

```
personal-cli --help
```

### alphabetSoup

Sort strings alphabetically

I provide two implementations

- Bubble sort 
- Counting sort

The way I organize this is by using abstract class and subclass that implements the function

```
AbstractClass AlphabetSoup

- inputStr: String

- validate() throws Exception // concrete implementation

+ process() String
```

Each of different implementation will override `process` methods


Command

```
Usage: personal-cli alphabet-soup --input-str=<inputStr> [-m=<mode>]
sort alphabetically
      --input-str=<inputStr>

  -m, --mode=<mode>   Sort mode, DEFAULT (use bubble sort), COUNTING_SORT
```

## How to run

### Docker

- Build the image

```
docker build . -t personal-cli
```

- run image and pass the arguments

```
docker run personal-cli [subcommand] [args]
```

#### alphabet-soup

```
docker run personal-cli alphabet-soup --input-str=dolgado
```

## Local Development

- Make sure you have installed java & maven
- in the root of project
  - mvn clean install
