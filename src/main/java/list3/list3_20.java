package list3;

class Vehicle12 {

    // тело класса из примера 3.19
    int passengers; // кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива


    Vehicle12(int f, int g, int h, int j) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;


    } // Vehicle12 () конструктор
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
    int getMaxSpeed() {

        return this.maxspeed;
    }
    int getWheels() {

        return this.wheels;
    }

    // новый метод
    public String toString () {
        return "Vehicle12(passengers=" + passengers + ";" + "wheels=" + wheels + ";" + "maxspeed=" + maxspeed + ";" + "burnup=" + burnup + ")";
    } // toString() method

} // class Vehicle 12

class Auto1 extends Vehicle12 {
    public String toString(){
        return "Auto1(passengers=" + passengers + ";" + "wheels=" + super.getWheels() + ";" + "maxspeed=" + super.getMaxSpeed() + ";" + "burnup=" + burnup + ";" + sunroof + ")";
    }
    boolean sunroof;  //наличие люка

    Auto1(boolean sunroof) {
        this (4, 4, 200, 12, sunroof);
    } // Auto2(boolean) constructor

    // конструктор подкласса Auto1 с 5 параметрами
    Auto1(int f, int g, int h, int j, boolean sunroof) {
        super(2, 2, 100, 9);
        this.sunroof = sunroof;
    } // Auto 2 (int, int, int, int, sunroof) constructor
} // class Auto 1

class VehicleOverrideDemo {

    public static void main(String[] args) {

        Vehicle12 v = new Vehicle12(2,2,100,9);
        Auto1 a = new Auto1(2,4,180,12,true);
        System.out.println("Vehicle12.toString(): " + a.toString());
        System.out.println("Auto1.toString(): " + a.toString());
    } // main
} // VehicleOverrideDemo
