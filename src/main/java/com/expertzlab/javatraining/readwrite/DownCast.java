package com.expertzlab.javatraining.readwrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class DownCast {

    private static String FILE_NAME = "read.txt";

    public static void main(String[] args) throws IOException {
        //Downward Cast
        Object obj = new FileWriter(FILE_NAME);

        MyFileWriter myFileWriter = null;

        //myFileWriter = (MyFileWriter) obj;
        if(obj instanceof MyFileWriter){
            myFileWriter = (MyFileWriter) obj;
        }
    }
}
