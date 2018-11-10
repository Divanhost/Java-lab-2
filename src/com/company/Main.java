package com.company;

import DataBase.City;
import com.company.DataProcess.FileManager;
import com.company.DataProcess.DataProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    FileManager fm = new FileManager();
    List<String> input = fm.load();
        DataProcessor ip = new DataProcessor();
        ArrayList<City> aaa = ip.process(input);
        fm.save(ip.getOutputArray(aaa));
    }
}
