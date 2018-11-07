package com.company.DataProcess;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    File file;
    public FileManager() {
        file = new File("D:\\Projects\\Java\\LAb2\\src\\com\\company\\information.txt");
    }
    public List<String> load(){

        List<String> strings = new ArrayList<String>();
        Scanner sc;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                strings.add(line);

               // System.out.println(line); //печать строки в стандартный вывод
            }
            sc.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {

        }

        // return List DONE
        return  strings;
    }
    public void save(String [] output){

        try {
            PrintWriter out = new PrintWriter("information.txt");
            for(int i =0; i<output.length;i++) {
                out.println(output[i]);
            }
            out.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
