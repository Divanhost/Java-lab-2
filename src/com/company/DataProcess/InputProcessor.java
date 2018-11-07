package com.company.DataProcess;

import DataBase.City;
import DataBase.FuelTank;
import DataBase.GasStation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;

public class InputProcessor {
    public ArrayList<City> process(List<String> input){
        ArrayList<City> cities = new ArrayList<>();
        int i =1;
        String cityName;
        boolean hasBegin = false;
        try {
            // Iterator
            ListIterator<String> iter = input.listIterator();
            while (iter.hasNext()) {
                City city = new City();
                city.setName(iter.next());
                // TODO equals
              while(iter.hasNext()){
                  String a = iter.next();
                    if (a.contains("АЗС")) {
                        GasStation gs = new GasStation(a);
                        a = iter.next();
                        gs.setCash(Integer.parseInt(a.substring(9,a.length()-1)));
                        a =iter.next();
                        while (!a.contains("АЗС")) {
                            if (a.contains("ТЦ")){
                                String one = iter.next();
                                String two = iter.next();
                                String three = iter.next();
                                FuelTank ft = new FuelTank(
                                        one.substring(13),
                                        Integer.parseInt(two.substring(15,two.length()-1)),
                                        Integer.parseInt(three.substring(23,three.length()-1))
                                );
                                gs.addFuelTank(ft);
                            }
                            a=iter.next();
                            if(a.equals("]")) break;
                            //iter.previous();
                        }
                        city.addGasStation(gs);

                    }
                    break;
//                  if(iter.next().equals("]")) break;
//                  iter.previous();
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

