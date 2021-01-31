import java.util.Arrays;
import java.util.Comparator;


public class Dispatcher {
    public static void main(String[] args) {
        int[] x = {1, 4, 6, 2, 5, 2, 7, 0};
        String[] s = {"anisk", "serg", "paul", "polina"};
        Arrays.sort(x);
        Arrays.sort(s);
        for (int item : x) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (String str : s) {
            System.out.print(str + " ");
        }
        Car c1 = new Car(221, 5200, "BMW", "Black");
        Car c2 = new Car(220, 2400, "Audi", "Red");
        Car c3 = new Car(110, 3000, "Peugeot", "Brown");
        Car[] carArray = {c1, c2, c3};
        System.out.println("\n\nSort by model:\n");

        Arrays.sort(carArray);
        for (Car c : carArray) {
            System.out.println(c + " ");
        }



        System.out.println("\nSort by color:\n");
        Arrays.sort(carArray, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.color.compareTo(o2.color);
            }
        });
        for (Car c: carArray) {
            System.out.println(c + " ");
        }

        System.out.println("\nSort by price:\n");


        Arrays.sort(carArray, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });
        for (Car c : carArray) {
            System.out.println(c + " ");
        }

        System.out.println("\nSort by speed:\n");

        Arrays.sort(carArray, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Car) o1).speed - ((Car) o2).speed;
            }
        });
        for (Car c : carArray) {
            System.out.println(c + " ");
        }
    }

}

