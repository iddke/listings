package list3;

interface A {
    void metodA(); // метод А() интерфейса A
}
interface B extends A {
    void metodB(); // метод В() интерфейса B
}
class IExample implements B {
    public void metodA() {System.out.println ("Метод A");}
    public void metodB() {System.out.println ("Метод B");}
}
class IExampleDemo {
    public static void main(String[] args) {
        IExample ie = new IExample();
        ie.metodA(); // вызов метода интерфейса A
        ie.metodB(); // вызов метода интерфейса B
    } // main
} // IExampleDemo
