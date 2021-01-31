import java.util.Calendar;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;
    int i;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    Car() {
    }

    public String toString() {
        return this.model + " " + this.color + " "
                + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Car o) {
        int temp = this.model.compareTo(o.model);
//        if (this.model.compareTo(((Car) o).model) == 0) {
//            temp = this.speed - ((Car) o).speed;
//            if (temp == 0) {
//                temp = this.price - ((Car) o).price;
//                if (temp == 0) {
//                    temp = this.color.compareTo(((Car) o).color);
//
//                }
//            }
//        }
        return temp;

    }

//    static class CompatatorByPrice implements Comparator {
//        public int compare(Object o1, Object o2) {
//            return ((Car) o1).price - ((Car) o2).price;
//        }
//    }

//    static class CompatatorBySpeed implements Comparator {
//        public int compare(Object o1, Object o2) {
//            return ((Car) o1).speed - ((Car) o2).speed;
//        }
//    }
//
//    static class ComparatorByColor implements Comparator {
//        public int compare(Object o1, Object o2) {
//            return ((Car) o1).color.compareTo(((Car) o2).color);
//        }
//    }


}