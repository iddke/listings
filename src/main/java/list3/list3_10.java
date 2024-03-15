package list3;

class Vehicle7 {
    int passengers; // кол-во пассажиров
    int wheels; // число колес
    int maxspeed; // макс. скорость
    int burnup; // расход топлива

    //к конструктор класс Vehicle7
    Vehicle7(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle7 (int,int,int,int) constructor
        // расчет пройденного пути
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } //distance (double) method
} // Vehicle7 class

class VehicleAccessDemo {

    public static void main(String[] args) {

        Vehicle7 ferrari = new Vehicle7(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " + distance + " км.");
        System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч");

    } //main

} // VehicleAccessDemo class
