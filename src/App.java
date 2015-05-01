import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class App {
    private ParkingLot parkingLot;
    private  Queue<Car> cars;

    public App(ParkingLot pl) {
        this.parkingLot = pl;
        cars = new LinkedList<Car>();
    }

    public void run(int carNo,int option){
        final int parkCar = 1;
        Driver driver = new Driver();
        if(option == parkCar) {
            cars.add(new Car(carNo));
            parkCar(driver,cars,parkingLot);
        }
        else
            driver.unParkCar(parkingLot,new Car(carNo));
            if(!cars.isEmpty() && parkingLot.isPlaceAvailable())
                driver.parkCar(parkingLot,cars.poll());
    }

    private static void parkCar(Driver driver, Queue<Car> cars, ParkingLot parkingLot) {
        Car car = cars.poll();
        if(driver.parkCar(parkingLot,car)!=null){
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

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        App app = new App(parkingLot);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<4){
        int option = app.getOption(sc);
        int carNo = app.getCarNo(sc);
            app.run(carNo,option);
            i++;
        }
    }



}
