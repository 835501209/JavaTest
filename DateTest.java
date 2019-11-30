import java.util.Date;
import java.text.*;
import java.util.*;

public class DateTest {
    public DateTest() {

    }

    public void Interval() {
        try {
            // Date a = new Date();
            long start = System.currentTimeMillis();
            System.out.println("start:" + start);
            Thread.sleep(1000 * 3); // 休眠3秒 //java中除了RuntimeException及其任何子类,其它类都被java的异常强制处理机制强制异常处理
            // Date b = new Date();
            long end = System.currentTimeMillis();
            System.out.println("end:" + end);
            System.out.println(end - start);
        } catch (Exception e) {

        }
    }

    public void Calendars(){
        //创建Calendar类对象
        Calendar c1 = Calendar.getInstance();    //默认是当前时间的对象
        // c.set(2015,9,7);
        // c.set(Calendar.YEAR,2016);
        c1.add(Calendar.DATE,-10);
        System.out.println("c:"+c1.getTime());
    }

    // public final void set(int year,int month,int day);
    public static void main(String args[]) {
        // Date date = new Date();
        DateTest time = new DateTest();
        // System.out.println(date.toString());
        // // 获取距离1970年的毫秒数
        // System.out.println(date.getTime());

        // // 使用SimpleDateFormat格式化日期
        // // SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // SimpleDateFormat ft = new SimpleDateFormat("z");
        // System.out.println(ft.format(date));

        // // c的使用
        // System.out.printf("全部日期和时间信息：%tc%n", date);
        // // f的使用
        // System.out.printf("年-月-日格式：%tF%n", date);
        // // d的使用
        // System.out.printf("月/日/年格式：%tD%n", date);
        // // r的使用
        // System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        // // t的使用
        // System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        // // R的使用
        // System.out.printf("HH:MM格式（24时制）：%tR", date);
        // try{
        // System.out.println(new Date() + "\n");
        // Thread.sleep(1000 * 3); // 休眠3秒
        // //java中除了RuntimeException及其任何子类,其它类都被java的异常强制处理机制强制异常处理
        // System.out.println(new Date() + "\n");
        // }
        // catch(Exception e){

        // }
        // time.Interval();
        time.Calendars();
    }
}