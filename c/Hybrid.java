package c;

public class Hybrid implements ElectricVehicle, GasVehicle {
    private int batteryLevel;
    private int fuelLevel;
    private double costPerkWh;
    private double costPerGallon;


    private int milesTraveled;
    private double gallonsUsed;
    private double kWhUsed;
    


    public Hybrid(int batteryLevel, int fuelLevel) {
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
    }

    public void setMilesTraveled(int miles) {
        this.milesTraveled = miles;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setGallonsUsed(double gallons) {
        this.gallonsUsed = gallons;
    }

    public double getGallonsUsed() {
        return gallonsUsed;
    }

    public void setKWhUsed(double kWh) {
        this.kWhUsed = kWh;
    }

    public double getKWhUsed() {
        return kWhUsed;
    }

    public double getMilesPerGallon() {
        return gallonsUsed == 0 ? 0 : (double) milesTraveled / gallonsUsed;
    }

    public double getMilesPerGallonE() {
        final double kWh_per_gallon = 33.7;
        return kWhUsed == 0 ? 0 : (double) milesTraveled / kWhUsed * kWh_per_gallon;
    }

    public double getAverageMPG() {
        return (getMilesPerGallon() + getMilesPerGallonE()) / 2.0;
    }

    @Override
    public void setCostPerkWh(double cost) {
        this.costPerkWh = cost;
    }
    @Override
    public double getCostPerkWh() {
        return costPerkWh;
    }
    @Override
    public void setCostPerGallon(double cost) {
        this.costPerGallon = cost;
    }
    @Override
    public double getCostPerGallon() {
        return costPerGallon;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println("Fuel tank full.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}