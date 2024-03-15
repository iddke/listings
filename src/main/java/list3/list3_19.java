package list3;

// базовый класс Vehicle
class Vehicle11 {
    //возьте тело класса из примера 3.11 и добавьте
    //конструктор без параметров из примера 3.15

    int passengers; // кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    Vehicle11() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;


    } // Vehicle11 () конструктор
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
    int getMaxSpeed() {

        return this.maxspeed;
    }
} // Vehicle11 class

//подкласс (потомок) Auto базового класса Vehicle
class Auto extends Vehicle11 {
    boolean sunroof; // наличие люка


} // Auto class

class ExtendsVehicleDemo {
    public static  void main(String[] args) {

        //создание объекта подкласса авто
        Auto bmw = new Auto();
        bmw.sunroof = true; // люк есть

        // пример обращения к методам и переменным
        // надкласса и подкласса
        System.out.println(" Путь , пройденный за 1.5 час: " + bmw.distance(1.5) + " км. ");
        System.out.println(" Макс.Скорость: " + bmw.getMaxSpeed() + " км/ч. ");
        System.out.println(" Наличие люка: " + bmw.sunroof);
    } //
} //ExtendsVehicleDemo class