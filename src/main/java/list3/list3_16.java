package list3;

class Vehicle10 {
    int passengers; // кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // максимальная скорость
    int burnup; // расход топлива

    // конструктор без параметров
    Vehicle10() {
        this(4, 4, 160, 13);
    } // Vehicle10 конструктор

    // конструктор с параметрами
    Vehicle10 (int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle10 (int,int,int,int) конструктор

    // методы расчета длины пройденного пути
    double distance(int interval) {

        return distance((double) interval);
    }
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    } // distance
} // Vehicle10 class
