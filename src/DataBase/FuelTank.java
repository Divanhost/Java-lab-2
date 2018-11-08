package DataBase;
enum   FuelKind{
    АИ98, АИ95, АИ92, ДТ, Газ;

    public String toString(){
        switch(this){
            case АИ98 :
                return "АИ-98";
            case АИ95 :
                return "АИ-95";
            case АИ92 :
                return "АИ-92";
            case ДТ :
                return "ДТ";
            case Газ :
                return "Газ";
        }
        return null;
    }

    public static FuelKind valueOfFK(String value){
        if(value.equalsIgnoreCase(АИ98.toString()))
            return FuelKind.АИ98;
        else if(value.equalsIgnoreCase(АИ95.toString()))
            return FuelKind.АИ95;
        else if(value.equalsIgnoreCase(АИ92.toString()))
            return FuelKind.АИ92;
        else if(value.equalsIgnoreCase(ДТ.toString()))
            return FuelKind.ДТ;
        else if(value.equalsIgnoreCase(Газ.toString()))
            return FuelKind.Газ;
        else
            return null;
    }


}

public class FuelTank {

    FuelKind fuel;
    int currentAmount;
    int commonAmount;
    String name;
    public String getName() {
        return name;
    }
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

    public FuelTank(String fuelName,String fuelStr,int a,int c) {
        this.fuel = FuelKind.valueOfFK(fuelStr);
        currentAmount=a;
        commonAmount =c;
        name = fuelName;
    }
}
