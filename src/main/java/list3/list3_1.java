package list3;

public class list3_1 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    public static void main(String[] args) {
        list3_1 car1 = new list3_1();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;
        double distance = car1.maxspeed * 0.5;
        System.out.println("За ПОЛЧАСА CAR1 МОЖЕТ ПРОЕХАТЬ ");
        System.out.println(distance + " км.");
        car1 = null;
    } // main
} // list3_1
