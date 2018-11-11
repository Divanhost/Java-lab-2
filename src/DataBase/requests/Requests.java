package DataBase.requests;

import DataBase.City;
import DataBase.FuelTank;
import DataBase.GasStation;
import com.company.DataProcess.FileManager;
import com.company.DataProcess.DataProcessor;

import java.util.ArrayList;
import java.util.List;

public class Requests {
    private Requests() {
    }

    private static ArrayList<City> cities;

    public static  void load() {
        FileManager fm = new FileManager();
        List<String> input= fm.load();
        DataProcessor ip = new DataProcessor();
        cities = ip.process(input);
        System.out.println("Операция выполнена успешно");
    }

    public static void save() {
        FileManager fm = new FileManager();
        DataProcessor ip = new DataProcessor();
        fm.save(ip.getOutputArray(cities));
    }

    public static  void report() {

        for (City city : cities) {
            System.out.println(city.getName());

            for (GasStation gSt : city.getGasStation()) {
                System.out.println("\t" + gSt.getName());

                for (FuelTank fT : gSt.getFuelTank()) {
                    System.out.println("\t\t" + fT.getName());
                    System.out.println("\t\t\tВ кассе: " + gSt.getCash() + "р");
                    System.out.println("\t\t\tТип топлива: " + fT.getFuel());
                    System.out.println("\t\t\tОбщая ёмкость: " + fT.getTotalAmount());
                    System.out.println("\t\t\tТекущий объём топлива: " + fT.getCurrentAmount());
                }
            }
        }
    }

    public static  void info() {
        for (City city : cities) {
            System.out.println(city.getName());
        }
    }

    public static  void info(String town) {
        for (City city : cities) {
            if (town.equals(city.getName())) {
                for (GasStation gSt : city.getGasStation()) {
                    System.out.println(gSt.getName());
                }

                break;
            }
        }
    }

    public static  void info(String town, String gasSt)
    {
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        System.out.println("В кассе: " + gSt.getCash());
                        int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {
                            System.out.println("ТЦ№" + i);
                            i++;
                        }

                        break;
                    }
                }

                break;
            }
        }
    }

    public static  void info(String town, String gasSt, String fuelTank) {
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {

                            if (fuelTank.equals("ТЦ№" + i)){
                                System.out.println("Тип топлива: " + fT.getFuel());
                                System.out.println("Общая ёмкость: " + fT.getTotalAmount());
                                System.out.println("Текущий объём топлива: " + fT.getCurrentAmount());
                                break;
                            }

                            i++;
                        }

                        break;
                    }
                }

                break;
            }
        }
    }

    public static void infoPrices() {

    }

    public static  void  add (String town, String gasSt, String fuelTank, int volume){
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        //int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {

                            if (fuelTank.equals(fT.getName())){
                                fT.setCurrentAmount(fT.getCurrentAmount() + volume);
                                System.out.println("Операция выполнена успешно");
                                break;
                            }

                            //i++;
                        }

                        break;
                    }
                }

                break;
            }
        }
    }

    public static  void  sell (String town, String gasSt, String fuelTank, int volume){
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {

                            if (fuelTank.equals("ТЦ№" + i)){

                                fT.setCurrentAmount(fT.getCurrentAmount() - volume);
                                //ДОБАВИТЬ МНОЖИТЕЛЬ ЦЕНЫ
                                gSt.setCash(gSt.getCash() + volume);
                                System.out.println("Операция выполнена успешно");
                                break;
                            }

                            i++;
                        }

                        break;
                    }
                }

                break;
            }
        }
    }
}
