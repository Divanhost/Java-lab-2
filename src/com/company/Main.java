package com.company;

import DataBase.City;
import com.company.DataProcess.FileManager;
import com.company.DataProcess.InputProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    FileManager fm = new FileManager();
    List<String> input = fm.load();
        InputProcessor ip = new InputProcessor();
        ArrayList<City> aaa = ip.process(input);
        System.out.println(aaa.toString());
    }
}
