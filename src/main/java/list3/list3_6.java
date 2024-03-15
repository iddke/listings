package list3;

public class list3_6 {
    static class Ten {
        int x;
        Ten() {
            x=10;
        } // Ten()
    } // Ten class
        public static void main(String[] args) {
            Ten s1= new Ten();
            Ten s2= new Ten();
            if (s1.x==s2.x)
                System.out.println(s1.x + " = " + s2.x);
        } //main
} // list
