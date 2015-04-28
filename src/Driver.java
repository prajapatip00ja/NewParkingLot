
public class Driver  {

    public Car parkCar(ParkingLot parkingLot, Car car) {
        if(parkingLot.isPlaceAvailable()){
            parkingLot.addCar(car);
            System.out.println(car+" get parked");
            return null;
        }
        else
            System.out.println("no place available");
            return car;
    }

    public void unParkCar(ParkingLot parkingLot,Car car){
        parkingLot.releaseCar(car);
        System.out.println(car+" removed");
    }
}
