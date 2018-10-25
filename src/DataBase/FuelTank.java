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
    public FuelKind getFuel() {
        return fuel;
    }

    public void setFuel(FuelKind fuel) {
        this.fuel = fuel;
    }

    FuelKind fuel;
    int currentAmount;
    int commonAmount;

    public FuelTank(String fuelStr,int a,int c) {
        this.fuel = FuelKind.stringToFuelKind(fuelStr);
        currentAmount=a;
        commonAmount =c;
    }
}
