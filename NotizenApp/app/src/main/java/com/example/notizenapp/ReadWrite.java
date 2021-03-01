package com.example.notizenapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class ReadWrite {

    FileOutputStream fos;
    FileInputStream fis;

    public ReadWrite(FileOutputStream fos, FileInputStream fis) {

        this.fos = fos;
        this.fis = fis;

    }

    public List<String> readFile(String str) throws IOException {

        ArrayList<String> al = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        String line;
        StringBuffer buffer = new StringBuffer();
        while ((line = in.readLine()) != null) {
            al.add(line);
        }
        return al;
    }

    public void writetoFile(String str) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(fos));
        out.println(str);
        out.flush();
        out.close();
    }


}
