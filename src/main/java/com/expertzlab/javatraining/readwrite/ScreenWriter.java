package com.expertzlab.javatraining.readwrite;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class ScreenWriter extends Writer {


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
       System.out.println(cbuf);
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
