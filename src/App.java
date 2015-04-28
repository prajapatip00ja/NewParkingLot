import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by poojap on 28/04/15.
 */
public class App {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Queue<Car> cars =  new LinkedList<Car>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("enter option");
            int option = sc.nextInt();
            System.out.println("enter car no");
            int no = sc.nextInt();
            Driver driver1 = new Driver();
            if(option == 1){
                cars.add(new Car(no));
                driver1.parkCar(parkingLot,cars.poll());
            }
            else{
                driver1.unParkCar(parkingLot,new Car(no));
                if(!cars.isEmpty() && parkingLot.isPlaceAvailable())
                    driver1.parkCar(parkingLot,cars.poll());
            }
        }
    }

}
