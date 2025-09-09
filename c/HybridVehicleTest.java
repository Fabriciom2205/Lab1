package c;

import org.junit.Test;
import static org.junit.Assert.*;

public class HybridVehicleTest {
    @Test
    public void testGasMPG() {
        Hybrid car = new Hybrid(60, 90);
        car.setMilesTraveled(120);
        car.setGallonsUsed(6);
        car.setKWhUsed(0);
        assertEquals(20.0, car.getMilesPerGallon(), 0.01);
    }

    @Test
    public void testElectricMPGe() {
        Hybrid car = new Hybrid(60, 90);
        car.setMilesTraveled(300);
        car.setGallonsUsed(0);
        car.setKWhUsed(70);
        assertEquals(144.43, car.getMilesPerGallonE(), 0.01);
    }

    @Test
    public void testAverageMPG() {
        Hybrid car = new Hybrid(60, 90);
        car.setMilesTraveled(300); // for MPGe
        car.setGallonsUsed(6);     // for MPG
        car.setKWhUsed(70);        // for MPGe
        double expectedAvg = (car.getMilesPerGallon() + car.getMilesPerGallonE()) / 2.0;
        assertEquals(expectedAvg, car.getAverageMPG(), 0.01);
    }

    @Test
    public void testCostsSettersGetters() {
        Hybrid car = new Hybrid(60, 90);
        car.setCostPerGallon(3.50);
        car.setCostPerkWh(0.24);
        assertEquals(3.50, car.getCostPerGallon(), 0.001);
        assertEquals(0.24, car.getCostPerkWh(), 0.001);
    }
}