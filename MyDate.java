package packagee;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyDate {
    private int date;
    private int month;
    private int year;

    public MyDate(){
        TimeZone tz = TimeZone.getTimeZone("GMT+5");
        GregorianCalendar gcal = new GregorianCalendar(tz);
        date = gcal.get(Calendar.DATE);
        month = gcal.get(Calendar.MONTH);
        year = gcal.get(Calendar.YEAR);
    }
    public MyDate(long timeInMilli){
        setDate(timeInMilli);
    }
    public MyDate(int day, int month, int year){
        if(month == 0||month==2||month==4||month==6||month==7||month==9||month==11){
            if(day<1 || day >31)
                throw new RuntimeException("Month cannot inherit date");
            else
                date = day;
        }
        else if(month==3||month==5||month==8||month==10){
            if(day>30||day<1)
                throw new RuntimeException("Month cannot inherit date");
            else
                date = day;
        }
        else if(month == 1){
            if(year%4 == 0) {
                if (day < 1 || day > 29)
                    throw new RuntimeException("Month cannot inherit date.LEAP YEAR!!");
                else
                    date = day;
            }
            else{
                if (day < 1 || day > 28)
                    throw new RuntimeException("Month cannot inherit date");
                else
                    date = day;
            }
        }

        if(month>11 || month<0)
            throw new RuntimeException("No such month exists");
        else
            this.month = month;
        if(year<0)
            throw new RuntimeException("No negative year");
        else
            this.year = year;


    }

    public int getDay() {
        return date;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime){
        Date objdate = new Date(elapsedTime);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyyMMdd");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT+5"));
        String java_date = jdf.format(objdate);
        year = Integer.parseInt(java_date.substring(0,4));
        month = (Integer.parseInt(java_date.substring(4,6)))-1;
        date = Integer.parseInt(java_date.substring(6,8));
    }
}
