package com.expertzlab.javatraining.readwrite;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class ReadWrite {

    List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ReadWrite rw  = new ReadWrite();
        rw.readFromAFile();
        rw.writeToAFile();
    }

    public void readFromAFile(){

        String fileName = "read.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            list = stream.collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void writeToAFile() throws IOException {

        String fileName = "write.txt";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            list.forEach((str) -> {
                try {
                    writer.write(str);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }
}
