package c;

public interface GasVehicle {
    void refuel();
    int getFuelLevel();

    //added stubs set/get
    void setCostPerGallon(double cost);
    double getCostPerGallon();
}