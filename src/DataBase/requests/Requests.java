package DataBase.requests;

import DataBase.City;
import DataBase.FuelTank;
import DataBase.GasStation;
import com.company.DataProcess.FileManager;
import com.company.DataProcess.InputProcessor;

import java.util.ArrayList;

public class Requests {
    private Requests() {
    }

    private static ArrayList<City> cities;

    public  static  void load() {
        FileManager fm = new FileManager();
        String [] input = fm.load();
        InputProcessor ip = new InputProcessor();
        cities = ip.process(input);
        System.out.println("Операция выполнена успешно");
    }

    public  static void save() {

    }

    public  static  void report() {

        for (City city : cities)
        {
            System.out.println(city.getName());

            for (GasStation gSt : city.getGasStation())
            {
                System.out.println("\t" + gSt.getName());
                int i = 1;

                for (FuelTank fT : gSt.getFuelTank())
                {
                    System.out.println("\t\tТЦ№" + i);
                    System.out.println("\t\t\tВ кассе: " + gSt.getCash() + "р");
                    System.out.println("\t\t\tТип топлива: " + fT.getFuel());
                    System.out.println("\t\t\tОбщая ёмкость: " + fT.getCommonAmount());
                    System.out.println("\t\t\tТекущий объём топлива: " + fT.getCurrentAmount());

                    i++;
                }
            }
        }
    }

    public  static  void showInfo(String city) {

    }

    public  static  void showInfo(String city, String gasSt)
    {

    }

    public  static  void showInfo(String city, String gasSt, String fuelTank)
    {

    }
}
