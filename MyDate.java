package pacakge1.oops;

import java.util.Arrays;

public class MyDate {
    private String day;//eg mon tue wed
    private long month = -1;//eg jan feb in numbers
    private long year = -1;
    private long timeInMilli = -1;//time in millisecond since epoch

    public MyDate(){
        day = day();
        month = month();
        year = year();
    }
    public MyDate(String day,long month,long year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //sets time in millis
    private MyDate(char a){//gives time in millisecond since epoch
        timeInMilli = System.currentTimeMillis();
    }
    // sets final date eg mon/3/22
    public static MyDate CreateTimeInMilli(){//calling millisecond constructor
        return new MyDate('a');
    }
    //method for returning day eg mon tue wed
    public String getDay()
    {
        return day;
    }
    public long getMonth()
    {
        return month;
    }
    public long getYear()
    {
        return year;
    }
    public long getTimeInMilli(){
        return timeInMilli;
    }
    public String getDate(){
        String[] date = {day, String.valueOf(month), String.valueOf(year)};
        return Arrays.toString(date);
    }

    private String day() {
        int numberOfDay;
        numberOfDay = (int)(((days()+4)%7));
        if(numberOfDay == 1){
            return "Monday";
        }
        if(numberOfDay == 2){
            return "Tuesday";
        }
        if(numberOfDay == 3){
            return "Wednesday";
        }
        if(numberOfDay == 4){
            return "Thursday";
        }
        if(numberOfDay == 5){
            return "Friday";
        }
        if(numberOfDay == 6){
            return "Saturday";
        }
        if(numberOfDay == 0){
            return "Sunday";
        }
        return null;
    }
    private long days(){
        return (int) (System.currentTimeMillis()/(86400*1000));
    }
    private long year(){
        return (int)((days()/365.25)+1970);
    }
    private long month(){
        return  (int)((days()%365.25)/30.437);
    }
    public static void main(String[] args) {
    }
}
