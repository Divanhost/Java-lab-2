package DataBase;

import java.util.ArrayList;

public class GasStation {
    private final String name;

    public GasStation(String name) {
        this.fuelTank = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<FuelTank> getFuelTank() {
        return fuelTank;
    }

    public void addFuelTank(FuelTank  fuelTank) {
        this.fuelTank.add(fuelTank);
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
    private ArrayList<FuelTank> fuelTank;
    private int cash;
}
