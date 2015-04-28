
public class Driver  {

    public void parkCar(ParkingLot parkingLot, Car car) {
        if(parkingLot.isPlaceAvailable()){
            parkingLot.addCar(car);
            System.out.println("car parked");
        }
        else
            System.out.println("no place");
    }

    public void unParkCar(ParkingLot parkingLot,Car car){
        parkingLot.releaseCar(car);
        System.out.println("removed");
    }
}
