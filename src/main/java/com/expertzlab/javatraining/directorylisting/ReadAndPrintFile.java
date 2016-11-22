package com.expertzlab.javatraining.directorylisting;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by gireeshbabu on 23/11/16.
 */
public class ReadAndPrintFile {

    public static void main(String[] args) {
        Path filePath = Paths.get("readthis.txt");
        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
