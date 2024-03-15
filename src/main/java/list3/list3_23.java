package list3;

class DisionByZeroException extends Exception {
    public String getMessage() {
        return "Деление на ноль запрещено!";
    }
}
class ExcpetionDemo {
    private static double divide (double dividend, double divisor)
            throws DisionByZeroException {

        if (divisor == 0)
            throw new DisionByZeroException();
        return dividend / divisor;
    }
    public static void main (String[] args) {
        try {
            divide(8, 0);
        } catch (DisionByZeroException dz) {
            System.out.println(dz.getMessage ()) ;
        } // catch
    } // main
} // ExcpetionDemo
