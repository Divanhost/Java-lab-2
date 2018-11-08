package com.company;

import DataBase.City;
import com.company.DataProcess.FileManager;
import com.company.DataProcess.DataProcessor;

import DataBase.requests.Requests;

public class Main {

    public static void main(String[] args) {
        Requests.load();
        //Requests.info("Москва");
        //Requests.info("Москва", "АЗС№1");
        //Requests.info("Москва", "АЗС№1", "ТЦ№1");
        //Requests.add("Москва", "АЗС№1", "ТЦ№1", 100);
        //Requests.report();

    }
}
