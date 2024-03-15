package list3;

class Vehicle8 {
    int passengers; // кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    //Конструктор класса Vehicle8
    Vehicle8(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setwheels( wheels );
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle8 конструктор

    // расчет пройденного пути
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } //distance(double) method

    //метод чтения значения maxspeed
    int getMaxSpeed() {

        return this.maxspeed;
    }
    // метод чтения значения кол-ва колес
    int getWheels() {

        return this.wheels;
    }
    // метод записи кол-ва колес
    void setwheels(int wheels) {
        //проверяем переданный параметр на корректность
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }
} // Vehicle8 class

class VehicleGetSetMethod {

    public static void main(String[] args) {

        Vehicle8 ferrari = new Vehicle8 (2, -2, 360, 12);
        System.out.println("Мах скорость: " + ferrari.getMaxSpeed() + " км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());
        ferrari.setwheels(4);
        System.out.println("Число колес (повторно) : " + ferrari.getWheels());
    } //main
} // VehicleGetSetMethod class