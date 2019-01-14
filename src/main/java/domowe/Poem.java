package domowe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Poem {


    public static void main(String[] args) throws IOException {
        Poem poem = new Poem();
        poem.transformFile();
    }

    private void transformFile() throws IOException {
        Stream<String> readFile = Files.lines(Paths.get("brzechwa.txt"));
        /*someString
                .map(x->x.substring(0,1).toUpperCase()+x.substring(1))
                .map(x->x+",")
                .forEach(System.out::println);*/   // tutaj przecinek zostawał na końcu wiersza

        String text = readFile
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(",\n"));

        System.out.println(text);

        Path writeFile = Files.createFile(Paths.get("modified.txt"));
    }
}
