import java.util.Queue;

public class Driver  {

    public void parkCar(ParkingLot parkingLot, Queue<Car> cars) {
        if(parkingLot.isPlaceAvailable()){
            parkingLot.addCar(cars.poll());
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
