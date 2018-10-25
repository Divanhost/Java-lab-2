package com.company.DataProcess;

import DataBase.City;
import DataBase.FuelTank;
import DataBase.GasStation;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class InputProcessor {
    public ArrayList<City> process(String [] input){
        ArrayList<City> cities = new ArrayList<>();
        int i =1;
        String cityName;
        boolean hasBegin = false;
        try {
            while (i < input.length) {

                //if(!input[i-1].equals("[")); //todo exception
                City city = new City();
                city.setName(input[i]);
              while(input[i] != "]" && i < input.length-1){
                  i++;
                    if (input[i].contains("АЗС")) {
                        GasStation gs = new GasStation(input[i]);
                        i++;
                        gs.setCash(Integer.parseInt(input[i].substring(9,input[i].length()-1)));
                        i++;
                        while (!input[i].contains("АЗС")) {
                            if (input[i].contains("ТЦ")){
                                FuelTank ft = new FuelTank(
                                        input[i+1].substring(13,input[i+1].length()),
                                        Integer.parseInt(input[i+2].substring(15,input[i+2].length()-1)),
                                        Integer.parseInt(input[i+3].substring(23,input[i+3].length()-1))
                                );
                                gs.addFuelTank(ft);
                                i+=4;
                            }
                            if(input[i].equals("]")) break;
                        }
                        city.addGasStation(gs);

                    }
                  if(input[i].equals("]")) break;
              }

              cities.add(city);
              i++;
            }
        }
        catch(Exception a){

        }
        return cities;
    }
}

