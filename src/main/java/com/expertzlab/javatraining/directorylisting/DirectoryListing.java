package com.expertzlab.javatraining.directorylisting;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by gireeshbabu on 23/11/16.
 */
public class DirectoryListing {

    public static void main(String[] args) {
        Path path = Paths.get("/Users/gireeshbabu/workspace/tools");
        //no filter applied
        System.out.println("\nNo filter applied:");
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path file : ds) {
                System.out.println(file.getFileName()+"  - is directory "+ Files.isDirectory(file));
            }
        }catch(IOException e) {
            System.err.println(e);
        }
    }
}
