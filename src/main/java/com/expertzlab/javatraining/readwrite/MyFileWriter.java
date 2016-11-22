package com.expertzlab.javatraining.readwrite;

import java.io.*;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class MyFileWriter extends Writer {

    String fileName;

    MyFileWriter(String fileName){

       this.fileName = fileName;

    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(cbuf,off,len);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
