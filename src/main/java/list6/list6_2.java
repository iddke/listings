package list6;

import java.io.*;
class MyApp {
    public  static  void main(String [] args) {

        try {
            PrintStream errOut = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(errOut);

            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        } catch (Exception e) {}

        System.out.println("Сообщения о нормальной работе программы");
        System.err.println("Сообщения об ошибках");

    } // main
} // class MyApp
