import java.util.Date;
import java.text.*;
import java.util.*;

public class DateTest {
    public DateTest() {

    }

    public static void main(String args[])  {
        // Date date = new Date();

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
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3); // 休眠3秒      //java中除了RuntimeException及其任何子类,其它类都被java的异常强制处理机制强制异常处理
            System.out.println(new Date() + "\n");
        }
        catch(Exception e){
            
        }
    }
}