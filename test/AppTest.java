import org.junit.Test;


import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class AppTest {
    @Test
    public void isPlaceAvailableShouldGiveTrueWhenOneCarIsParkingInTheParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        App app = new App(parkingLot);
        app.run(11,1);
        assertTrue(parkingLot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldGiveFalseWhenTwoCarIsParkingInTheParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        App app = new App(parkingLot);
        app.run(11,1);
        app.run(12,1);
        assertFalse(parkingLot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldGiveTrueWhenOneCarIsUnParked(){
        ParkingLot parkingLot = new ParkingLot();
        App app = new App(parkingLot);
        app.run(11,1);
        app.run(12,1);
        app.run(12,2);
        assertTrue(parkingLot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldGiveFalseWhenThirdCarIsWaitingAndFourthCarIsUnParking(){
        ParkingLot parkingLot = new ParkingLot();
        App app = new App(parkingLot);
        app.run(11,1);
        app.run(12,1);
        app.run(13,1);
        app.run(12,2);
        assertFalse(parkingLot.isPlaceAvailable());
    }


}
