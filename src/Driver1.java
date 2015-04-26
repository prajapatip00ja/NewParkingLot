/**
 * Created by poojap on 25/04/15.
 */
public class Driver1 extends Driver {

    public Driver1(ParkingLot parkingLot) {
       this.parkingLot = parkingLot;
       this.parkingLot.attach(this);
    }


    @Override
    public void parkCar(Car car) {
        parkingLot.addCar(car);
    }

    @Override
    public void unparkCar(Car car) {
        parkingLot.releaseCar(car);
    }

}
