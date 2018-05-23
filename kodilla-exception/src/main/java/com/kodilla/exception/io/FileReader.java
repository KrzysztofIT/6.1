package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile ()throws FileReaderException{

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names").getFile());
        //Path path = Paths.get(file.getPath());
        //Path path = Paths.get("files/names");

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            //Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            System.out.println("Something is not YES" + e);
            throw new FileReaderException();
        }finally {

            System.out.println("lalala");
        }
        //System.out.println(file.getPath());
    }
}
