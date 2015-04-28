public class Car {
    private int carNo;

    public Car(int carNo) {
        this.carNo = carNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carNo != car.carNo) return false;

        return true;
    }

    @Override
    public String toString() {
        return "car "+carNo;
    }
}
