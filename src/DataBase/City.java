package DataBase;

import java.util.ArrayList;

public class City {

    private ArrayList <GasStation>  gasStation;
    private String name;

    public ArrayList <GasStation> getGasStation() {
        return gasStation;
    }

    public void addGasStation(GasStation gs){
        this.gasStation.add(gs);
    }

    public City() {
        this.gasStation = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
