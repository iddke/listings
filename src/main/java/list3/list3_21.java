package list3;

class Vehicle13 {

    // тело класса из примера 3.19
    int passengers; // кол-во пассажиров
    private int wheels; // число колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива



    Vehicle13(int f, int g, int h, int j) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;


    } // Vehicle13 () конструктор

    public Vehicle13() {

    }

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

} // class Vehicle 13
class Auto2 extends Vehicle13 {
    public String toString(){
        return "Auto1(passengers=" + passengers + ";" + "wheels=" + super.getWheels() + ";" + "maxspeed=" + super.getMaxSpeed() + ";" + "burnup=" + burnup + ";" + sunroof + ")";
    }
    boolean sunroof;  //наличие люка

    Auto2(boolean sunroof) {
        this (4, 4, 200, 12, sunroof);
    } // Auto2(boolean) constructor

    // конструктор подкласса Auto1 с 5 параметрами
    Auto2(int f, int g, int h, int j, boolean sunroof) {
        super(2, 2, 100, 9);
        this.sunroof = sunroof;
    } // Auto 2 (int, int, int, int, sunroof) constructor
} // class Auto 2
class PolyVehicleDmo {

    public static void main(String[] args) {

        Auto2 a = new Auto2(true); // экземпляр подкласса Auto2
        Vehicle13 v = new Vehicle13(); // экземпляр класса Vehicle

        /*
         **поместим оба объекта в массив типа Vehicle
         ** Первый элемент массива
         ** pvd[0] будет содержать экземпляр подкласса Auto,
         ** а второй - экземпляр класса Vehicle
         */
        Vehicle13[] pvd = { a , v };

        for ( int i = 0; i < pvd.length; i++) {
            //динамический выбор версии
            // переопреленного метода toString ()
            System.out.println(pvd[i].toString());
        } // for

    } //main
} // PolyVehicleDemo class
