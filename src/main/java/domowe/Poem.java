package domowe;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Poem {

    private String text = "";

    public Poem() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Poem poem = new Poem();
        poem.transformFile();
        poem.writeFile();
    }

    private void transformFile() throws IOException {
        /*someString
                .map(x->x.substring(0,1).toUpperCase()+x.substring(1))
                .map(x->x+",")
                .forEach(System.out::println);*/   // tutaj przecinek zostawał na końcu wiersza
        Stream<String> readFile = Files.lines(Paths.get("brzechwa.txt"));
        text = readFile
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(",\n"));

        System.out.println(text);
//        Files.write(Paths.get("newBrzechwa.txt"), (Iterable<String>) readFile::iterator);//można i tak
    }

    private void writeFile() throws IOException {
        try {

            Path path = Files.createFile(Paths.get("modified.txt")); // tworzenie pliku
            Path files = Files.write(path, text.getBytes()); // zapisywanie treści do pliku
        } catch (FileAlreadyExistsException e) {
            Files.delete(Paths.get("modified.txt"));
            Path path = Files.createFile(Paths.get("modified.txt"));
            Path files = Files.write(path, text.getBytes());
        }
    }
}
