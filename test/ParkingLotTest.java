import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by poojap on 28/04/15.
 */
public class ParkingLotTest {
    @Test
    public void isPlaceAvailableShouldReturnTrueWhenParkingLotIsFree(){
       ParkingLot pl = new ParkingLot();
       Driver driver = new Driver();
       assertTrue(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnTrueWhenOneCarIsParked(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        Queue<Car> cars = new LinkedList<Car>();
        cars.add(new Car(10));
        driver.parkCar(pl,cars);
        assertTrue(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnFalseWhenParkingLotIsFull(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        Queue<Car> cars = new LinkedList<Car>();
        cars.add(new Car(10));
        cars.add(new Car(11));
        driver.parkCar(pl, cars);
        driver.parkCar(pl,cars);
        assertFalse(pl.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnTrueWhenParkingLotIsFullAndOneCarIsReleasing(){
        ParkingLot pl = new ParkingLot();
        Driver driver = new Driver();
        Queue<Car> cars = new LinkedList<Car>();
        cars.add(new Car(10));
        cars.add(new Car(11));
        driver.parkCar(pl,cars);
        driver.parkCar(pl,cars);
        driver.unParkCar(pl,new Car(10));
        assertTrue(pl.isPlaceAvailable());
    }

}
