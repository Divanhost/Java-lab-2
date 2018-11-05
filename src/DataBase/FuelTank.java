package DataBase;
enum   FuelKind{
    АИ98, АИ95, АИ92, ДТ, Газ;
    public static FuelKind stringToFuelKind(String fuel){
        if(fuel.replaceAll("-","").equals(FuelKind.АИ98.toString())) {
            return FuelKind.АИ98;
        } else
        if(fuel.replaceAll("-","").equals(FuelKind.АИ95.toString())) {
            return FuelKind.АИ95;
        } else
        if(fuel.replaceAll("-","").equals(FuelKind.АИ92.toString())) {
            return FuelKind.АИ92;
        } else
        if(fuel.equals(FuelKind.ДТ.toString())) {
            return FuelKind.ДТ;
        } else
        if(fuel.equals(FuelKind.Газ.toString())) {
            return FuelKind.Газ;
        } else
        return null;
    }

}

public class FuelTank {

    FuelKind fuel;
    int currentAmount;
    int commonAmount;

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getCommonAmount() {
        return commonAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public FuelKind getFuel() {
        return fuel;
    }

    public void setFuel(FuelKind fuel) {
        this.fuel = fuel;
    }

    public FuelTank(String fuelStr,int a,int c) {
        this.fuel = FuelKind.stringToFuelKind(fuelStr);
        commonAmount=a;
        currentAmount =c;
    }
}
