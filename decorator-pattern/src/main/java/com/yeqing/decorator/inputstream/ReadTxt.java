package com.yeqing.decorator.inputstream;

import java.io.*;
import java.net.URL;

import static javax.xml.transform.OutputKeys.ENCODING;

public class ReadTxt {

    public InputStream getTxt() {
        InputStreamReader read = null;
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("test/test2.txt");
        return in;
    }
}
