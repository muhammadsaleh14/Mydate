package packagee;

public class Main1 {
    public static void main(String[] args) {
        MyDate test1 = new MyDate();
        System.out.println(test1.getDay()+" "+ test1.getMonth()+" "+ test1.getYear());

        MyDate test2 = new MyDate(561555550000L);
        System.out.println(test2.getDay()+" "+ test2.getMonth()+" "+ test2.getYear());

        MyDate test3 = new MyDate(29,1,2004);
        System.out.println(test3.getDay()+" "+ test3.getMonth()+" "+ test3.getYear());

    }
}
