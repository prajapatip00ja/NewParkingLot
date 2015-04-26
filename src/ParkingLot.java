
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars ;
    private final int sizeOfCar = 2;
    private List<Driver> drivers = new ArrayList<Driver>();
    public ParkingLot() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car){
        if(isPlaceAvailable()){
            cars.add(car);
        }
    }

    private boolean isPlaceAvailable() {
        return cars.size()<sizeOfCar;
    }

    public void attach(Driver driver) {
        drivers.add(driver);
    }

    public String accept(List<Car> cars) {
        for(int i = 0; i<drivers.size(); i++){
            drivers.get(i).parkCar(cars.get(i));
        }
        return "car parked successfully";
    }


    public String returns(List<Car> cars) {
        for(int i = 0; i<drivers.size(); i++){
            drivers.get(i).unparkCar(cars.get(i));
        }
        return "car removed successfully";
    }

    public void releaseCar(Car outerCar) {
         for(Car car : cars){
            if(car.equals(outerCar)){
                cars.remove(car);
            }
         }
    }
}
