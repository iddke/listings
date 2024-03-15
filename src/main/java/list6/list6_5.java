package list6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class DatePart {
    private Date fromDate = null;
    private SimpleDateFormat formatter = null;

    public DatePart (Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay () {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return  Integer.parseInt(formatter.format(fromDate));
    }

    public  int getYear () {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }
} // class DatePart
class DatePartTest {
    public static void main(String[] args) {

        Date currentDate = new Date();
        DatePart dp = new DatePart(currentDate);
        int month = dp.getMonth();

        System.out.println("Текущий месяц: " + month);
    } // main
} // class DatePartTest
