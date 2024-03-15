package list3;

class Vehicle6 {
    int passengers; // кол-во пассажиров
    int wheels; // число колес
    int maxspeed; // max. скорость
    int burnup; // расход топлива

    // конструктор
    Vehicle6(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle6 constructor

    //расчет пройденного пути
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    } // distance (double) method
} // Vehicle6 class
