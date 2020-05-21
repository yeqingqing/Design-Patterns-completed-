package com.yeqing.decorator.inputstream;

import java.io.*;
import java.net.URL;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            ReadTxt readTxt = new ReadTxt();
            InputStream in = readTxt.getTxt();
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
