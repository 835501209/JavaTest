import java.util.Scanner;

//键盘输入
public class ScannerTest {

  public void theNext() {
    Scanner scan = new Scanner(System.in);
    // 从键盘接收数据

    // next方式接收字符串
    System.out.println("next方式接收：");
    // 判断是否还有输入
    if (scan.hasNext()) {
      String str1 = scan.next();
      System.out.println("输入的数据为：" + str1);
    }
    System.out.println("你怕吗");
    scan.close();
  }

  public void theNextLine(){
    Scanner scan = new Scanner(System.in);

  }
  public static void main(String arg[]) {
    ScannerTest a = new ScannerTest();
    a.theNext();
    // a.theNextLine();
  }
}