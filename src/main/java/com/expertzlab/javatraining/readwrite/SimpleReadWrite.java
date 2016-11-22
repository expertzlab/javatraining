package com.expertzlab.javatraining.readwrite;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class SimpleReadWrite {

    public static void main(String[] args) throws IOException {

        char cbuf[] = new char[25];

        SimpleReadWrite srw = new SimpleReadWrite();
        Reader fileReader = new MyFileReader("read.txt");
        Writer fileWriter = new MyFileWriter("write.txt");
        fileReader.read(cbuf,0,25);
        fileWriter.write(cbuf,0,25);

        //Overriding
        //fileWriter = new ScreenWriter();
        //fileWriter.write(cbuf);

    }
}
