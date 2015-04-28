
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars ;
    private final int sizeOfCar = 2;

    public ParkingLot() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public boolean isPlaceAvailable() {
        return cars.size()<sizeOfCar;
    }

    public void releaseCar(Car outerCar) {
         for(Car car : cars){
            if(car.equals(outerCar)){
                cars.remove(car);
                return;
            }
         }
    }
}
