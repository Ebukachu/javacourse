package chapter6;

public class HomeAreaCalculator {
    public static void main (String args []) {
        Rectangle room1 = new Rectangle();
        room1.setWidth(30);
        room1.setLength(10);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(50, 10);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }

}

