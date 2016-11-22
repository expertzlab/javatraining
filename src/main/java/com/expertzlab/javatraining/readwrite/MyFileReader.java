package com.expertzlab.javatraining.readwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class MyFileReader extends Reader {

    String fileName;

    MyFileReader(String fileName){

        this.fileName = fileName;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        int readLen = bufferedReader.read(cbuf,off,len);
        bufferedReader.close();
        return readLen;

    }

    @Override
    public void close() throws IOException {

    }
}
