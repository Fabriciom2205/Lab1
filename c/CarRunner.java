package c;

public class CarRunner {
    public static void main(String[] args) {
        Hybrid car = new Hybrid(50, 80);

        
        car.setCostPerGallon(3.50);
        car.setCostPerkWh(0.24);

        // Fully gas mode
        car.setMilesTraveled(120);
        car.setGallonsUsed(6);
        car.setKWhUsed(0); 
        System.out.printf("Gas mode MPG: %.2f\n", car.getMilesPerGallon());

        // Fully electric mode
        car.setMilesTraveled(300);
        car.setGallonsUsed(0); 
        car.setKWhUsed(70);
        System.out.printf("Electric mode MPGe: %.2f\n", car.getMilesPerGallonE());

        // Hybrid mode 
        double avgMPG = (car.getMilesPerGallon() + car.getMilesPerGallonE()) / 2.0;
        System.out.printf("Hybrid mode average (MPG + MPGe)/2: %.2f\n", avgMPG);
    }
}