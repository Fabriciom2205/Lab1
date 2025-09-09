package c;

public interface ElectricVehicle {
    void chargeBattery();
    int getBatteryLevel();

    //added stubs set/get
    void setCostPerkWh(double cost);
    double getCostPerkWh();
}