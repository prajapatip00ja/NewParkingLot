import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class App {
    public static void main(String[] args) {
        App app = new App();
        ParkingLot parkingLot = new ParkingLot();
        Scanner sc = new Scanner(System.in);
        Queue<Car> cars =  new LinkedList<Car>();
        final int parkCar = 1;
        while (true){
            int option = app.getOption(sc);
            int CarNo = app.getCarNo(sc);

            Driver driver1 = new Driver();
            cars.add(new Car(CarNo));
            if(option == parkCar)
                parkCar(driver1,cars,parkingLot);
            else
                driver1.unParkCar(parkingLot,new Car(CarNo));
                if(!cars.isEmpty() && parkingLot.isPlaceAvailable())
                    driver1.parkCar(parkingLot,cars.poll());
        }
    }

    private static void parkCar(Driver driver1, Queue<Car> cars, ParkingLot parkingLot) {
           Car car = cars.poll();
           if(driver1.parkCar(parkingLot,car)!=null){
                cars.add(car);
           }
    }

    private int getOption(Scanner sc){
        System.out.println("enter 1 to park a car \n  enter 2 to unpark a car");
        return sc.nextInt();
    }

    private int getCarNo(Scanner sc){
        System.out.println("Enter car no.");
        return sc.nextInt();
    }

}
