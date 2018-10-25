package DataBase;

import java.util.ArrayList;

public class City {

    public ArrayList <GasStation> getGasStation() {
        return gasStation;
    }
    public void addGasStation(GasStation gs){
        this.gasStation.add(gs);
    }
    public City() {
        this.gasStation = new ArrayList<>();
    }

    private ArrayList <GasStation>  gasStation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
