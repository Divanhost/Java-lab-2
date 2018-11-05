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

        for (City city : cities) {
            System.out.println(city.getName());

            for (GasStation gSt : city.getGasStation()) {
                System.out.println("\t" + gSt.getName());
                int i = 1;

                for (FuelTank fT : gSt.getFuelTank()) {
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

    public  static  void info(String town) {
        for (City city : cities) {
            if (town.equals(city.getName())) {
                for (GasStation gSt : city.getGasStation()) {
                    System.out.println(gSt.getName());
                }

                break;
            }
        }
    }

    public  static  void info(String town, String gasSt)
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

    public  static  void info(String town, String gasSt, String fuelTank) {
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {

                            if (fuelTank.equals("ТЦ№" + i)){
                                System.out.println("Тип топлива: " + fT.getFuel());
                                System.out.println("Общая ёмкость: " + fT.getCommonAmount());
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

    public  static  void  add (String town, String gasSt, String fuelTank, int volume){
        for (City city : cities) {

            if (town.equals(city.getName())) {

                for (GasStation gSt : city.getGasStation()) {

                    if (gasSt.equals(gSt.getName())) {
                        int i = 1;

                        for (FuelTank fT : gSt.getFuelTank()) {

                            if (fuelTank.equals("ТЦ№" + i)){
                                fT.setCurrentAmount(fT.getCurrentAmount() + volume);
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

    public  static  void  sell (String town, String gasSt, String fuelTank, int volume){
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
