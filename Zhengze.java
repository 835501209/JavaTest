import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengze {
    String keyword = "akun";
    String str = "我是akun，我爱chang、tiao、200rap";

    public Zhengze() {
        // boolean isinclude = Pattern.matches(keyword, str);
        // System.out.println("xx"+isinclude);
        System.out.println(Pattern.matches(keyword, str));
    }

    public static void main(String[] args) {
        System.out.println("启动");
        Zhengze zz = new Zhengze();
        zz.groupBox();
    }

    public void groupBox() {
        String pattern = "(\\D*)(\\d+)(.*)";
        // 创建Pattern对象
        Pattern r = Pattern.compile(pattern);
          System.out.println("r: " + r );
          System.out.println("pattern: " + pattern );
        // 创建matcher对象
        // Matcher m = r.matcher(this.str);
        Matcher m = r.matcher(this.str);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) ); 
         } else {
            System.out.println("NO MATCH");
         }
    }
}