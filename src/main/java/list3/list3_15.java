package list3;

class Vehicle9 {
    int passengers; //кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // макс.скорость
    int burnup; // расход топлива

    /* конструктор без параметров,иницилизируюший
    ** переменные объекта стандартными значениями*/
    Vehicle9() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    } // Vehicle9 () конструктор

    /*конструктор с параметрами,инициализирующий
    ** переменные объекта значениями,переданными из
    вызывающей программы*/
    Vehicle9(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle9(int, int , int , int )
} // Vehicle9 class
