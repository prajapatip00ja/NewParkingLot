import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class ParkingLotTest {
    @Test
    public void ThreeDriversAreParkingTheCarsWhenThreeCarsAreComingAtATime(){
        ParkingLot parkingLot = new ParkingLot();
        new Driver1(parkingLot);
        new Driver2(parkingLot);
        new Driver3(parkingLot);
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(11));
        cars.add(new Car(12));
        cars.add(new Car(13));
        assertEquals(parkingLot.accept(cars), "car parked successfully");
    }



    @Test
    public void ThreeDriversAreReleasingTheCarsWhenThreeCarsAreReleasingAtATime(){
        ParkingLot parkingLot = new ParkingLot();
        new Driver1(parkingLot);
        new Driver2(parkingLot);
        new Driver3(parkingLot);
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(11));
        cars.add(new Car(12));
        cars.add(new Car(13));
        parkingLot.accept(cars);
        assertEquals(parkingLot.returns(cars),"car removed successfully;");
    }

}
