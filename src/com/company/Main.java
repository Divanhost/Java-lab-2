package com.company;

import DataBase.requests.Processor;
import DataBase.requests.Requests;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isStopped = false;

        while (!isStopped) {
            System.out.println("Здравствуйте. Введите вашу команду: \n");
            Scanner in = new Scanner(System.in);
            String query = in.nextLine();

            if (!query.isEmpty())
                Processor.processRequest(query);
        }
    }
}
