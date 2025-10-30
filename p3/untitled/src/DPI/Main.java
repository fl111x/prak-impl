package DPI;

public class Main {
    public static void main(String[] args) {
        Car fuelCar = new Car(new PentrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

//        boom boom
        fuelCar.start();
        dieselCar.start();
        hybridCar.start();

    }
}
