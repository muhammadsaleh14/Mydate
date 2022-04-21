package pacakge1.oops;

public class Main {
    public static void main(String[] args) {
        MyDate time1 = new MyDate();
        System.out.println(time1.getDate()+" "+time1.getDay()+" "+time1.getMonth()+" "+time1.getYear()+" "+time1.getTimeInMilli());

        MyDate time2 = new MyDate("Tuesday",6,2021);
        System.out.println(time2.getDate()+" "+time2.getDay()+" "+time2.getMonth()+" "+time2.getYear()+" "+time2.getTimeInMilli());

        MyDate time3 = MyDate.CreateTimeInMilli();
        System.out.println(time3.getDate()+" "+time3.getDay()+" "+time3.getMonth()+" "+time3.getYear()+" "+time3.getTimeInMilli());
    }
}
