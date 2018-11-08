package com.company.DataProcess;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class FileManager {
    File file;
    public FileManager() {
        file = new File("D:\\Projects\\Java\\LAb2\\src\\com\\company\\information.txt");
    }
    public List<String> load(){

        List<String> strings = new ArrayList<String>();

        try (Scanner sc = new Scanner(file)){

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                strings.add(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {

        }
        return  strings;
    }
    public void save(List<String> output){

        try {
            PrintWriter out = new PrintWriter("information.txt");
            ListIterator<String> iter = output.listIterator();

            while(iter.hasNext()){
                out.println(iter.next());
            }

            out.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
