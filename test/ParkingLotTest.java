import org.junit.Test;


import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class ParkingLotTest {
    @Test
    public void isPlaceAvailableShouldReturnTrueWhenParkingLotIsFree(){
       ParkingLot pl = new ParkingLot();
       assertTrue(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnTrueWhenOneCarIsParked(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        driver.parkCar(pl,new Car(11));
        assertTrue(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnFalseWhenParkingLotIsFull(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        driver.parkCar(pl, new Car(10));
        driver.parkCar(pl,new Car(11));
        assertFalse(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnTrueWhenParkingLotIsFullAndOneCarIsReleasing(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        driver.parkCar(pl,new Car(10));
        driver.parkCar(pl,new Car(11));
        driver.unParkCar(pl,new Car(11));
        assertTrue(pl.isPlaceAvailable());
    }

}
