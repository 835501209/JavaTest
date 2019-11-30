import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengze {
    String keyword = "akun";
    String strs = "我是akun，我爱chang、tiao、200rap";
    private static final String reg = "\\bakun\\b";
    private static final String str = "akun is ikun,akun just akun,akun is not akun";

    String reg2 = "foo";
    String str2 = "fooooooofoooo";
    String str3 = "ooooooooofooo";

    public Zhengze() {
        // boolean isinclude = Pattern.matches(keyword, str);
        // System.out.println("xx"+isinclude);
        System.out.println(Pattern.matches(keyword, str));
    }

    public void groupBox() {
        String pattern = "(\\D*)(\\d+)(.*)";
        // 创建Pattern对象
        Pattern r = Pattern.compile(pattern);
        System.out.println("r: " + r);
        System.out.println("pattern: " + pattern);
        // 创建matcher对象
        // Matcher m = r.matcher(this.str);
        Matcher m = r.matcher(this.strs);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
     public void startEnd(){
        Pattern p =  Pattern.compile(reg);
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find()){
            System.out.println("count"+count);
            System.out.println("start"+m.start());
            System.out.println("end"+m.end());
            count++;
        }
     }

     public void matchers(){
        Pattern p =  Pattern.compile(reg2);
        Matcher m1 = p.matcher(str2);
        Matcher m2 = p.matcher(str3);
        System.out.println("1:"+m1.matches());
        System.out.println("2:"+m2.matches());
        System.out.println("1:"+m1.lookingAt());
        System.out.println("2:"+m2.lookingAt());
        String sks = "dog";
        // String res = m1.replaceFirst(sks);
        String res = m1.replaceAll(sks);
        System.out.println("res:"+res);
     }

    public static void main(String[] args) {
        System.out.println("启动");
        Zhengze zz = new Zhengze();
        // zz.groupBox();
        // zz.startEnd();
        zz.matchers();
    }
}