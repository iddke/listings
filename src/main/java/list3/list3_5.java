package list3;

public class list3_5 {
    static class Vehicle {
        int passengers;
        int wheels;
        int maxspeed;
        int burnup;
        double distance(double interval) {
            double value = maxspeed * interval;
            return value;
        } // distance
    } // Vehicle
        public static void main(String[] args) {
            Vehicle car = new Vehicle();
            car.passengers=2;
            car.wheels=4;
            car.maxspeed=130;
            car.burnup=30;

            Vehicle bus = new Vehicle();
            bus.passengers=45;
            bus.wheels=4;
            bus.maxspeed=100;
            bus.burnup=25;
            double time = 0.5;
            double distanceCar=car.distance(time);
            double distanceBus=bus.distance(time);

            System.out.print(" Автомобиль с " + car.passengers + " пассажирами ");
            System.out.println("пройдет за полчаса путь " + distanceCar + " км.");
            System.out.print(" Автобус с " + bus.passengers + " пассажирами ");
            System.out.println("пройдет за полчаса путь " + distanceBus + " км.");
        } // main
} // list
