import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final int programEnd = 0;
    private static final int addNewCar = 1;
    private static final int getGar = 2;

    public static void main(String[] args) {
        carQueue();
        Car car = addCar();
    }

    public static void carQueue() {

        Queue<Car> carQueue = new LinkedList<>();
        int decision;

        do {
            System.out.println("co chcesz zrobić ?");
            decision = input.nextInt();
            input.nextLine();
            switch (decision) {
                case addNewCar:
                    Car car = addCar();
                    carQueue.offer(car);
                    break;
                case getGar:
                    if (carQueue.isEmpty()) {
                        System.out.println("Brak samochodów");
                    } else carQueue.poll();
                    break;
                case programEnd:
                    System.out.println("Do zobaczenia");
                    break;
                default:
            }
        } while (decision != programEnd);
    }

    private static Car addCar() {

        System.out.println("Podaj typ");
        String type = input.nextLine();
        System.out.println("Podaj marke");
        String marka = input.nextLine();
        System.out.println("Podaj model");
        String model = input.nextLine();
        System.out.println("Podaj rok");
        int year = input.nextInt();
        System.out.println("Podaj przebieh");
        int kilometers = input.nextInt();
        System.out.println("Podaj vin");
        int vin = input.nextInt();
        Car car = new Car(type, marka, model, year, kilometers, vin);
        return car;
    }
}
