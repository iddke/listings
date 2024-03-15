package list3;

class ParaByValue {
    void callByVal(int x, int y) {
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    } // callByVal
} //ParaByValue class

class ParaByValueDemo {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // передача параметров по значению
        ParaByValue test = new ParaByValue();
        test.callByVal(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    } // main
} // ParaByValueDemo class
