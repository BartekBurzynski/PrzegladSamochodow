import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
   private static final int programEnd = 0;
   private static final int addNewCar = 1;
   private static final int getGar = 2;

    public static void main(String[] args) {
        carQueue();
        Car car = addCar();
    }

    public static void carQueue() {
        Scanner input1 = new Scanner(System.in);
        Queue<Car> carQueue = new LinkedList<>();
        int decision;


        do {
            System.out.println("co chcesz zrobić ?");
            decision = input1.nextInt();
            input1.nextLine();

            if (decision == addNewCar) {
                Car car = addCar();
                carQueue.offer(car);
            } else if (decision == getGar) {
                carQueue.poll();
            } else if (decision == programEnd) {
                System.out.println("Do zobaczenia");
                break;
            }
        } while (decision != programEnd);
    }


    private static Car addCar() {
        String type;
        String marka;
        String model;
        int year;
        int kilometers;
        int vin;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj typ");
        type = input.nextLine();
        System.out.println("Podaj marke");
        marka = input.nextLine();
        System.out.println("Podaj model");
        model = input.nextLine();
        System.out.println("Podaj rok");
        year = input.nextInt();
        System.out.println("Podaj przebieh");
        kilometers = input.nextInt();
        System.out.println("Podaj vin");
        vin = input.nextInt();
        Car car = new Car(type, marka, model, year, kilometers, vin);
        return car;
    }
}
