public class CharacterTest{
    public CharacterTest(){

    }

    //转义字符
    public void escape(){
        System.out.println("欢迎来到\"Java!\"");
    }

    //字符方法
    public void methods(){
        System.out.println(Character.isLetter('a'));       //是否为字母
        System.out.println(Character.isDigit('5'));        //是否为数字
        System.out.println(Character.isWhitespace(' '));   //是否为空白字符
        System.out.println(Character.isUpperCase('A'));    //是否为大写字符
        System.out.println(Character.isLowerCase('a'));    //是否为小写字符
        System.out.println(Character.toUpperCase('b'));    //转为大写字符
        System.out.println(Character.toLowerCase('B'));    //转为小写字符
        System.out.println(Character.toString(68));        //转为字符类型返回,长度为1,数字代表ASCII码
    }

    public static void main(String [] args){
        CharacterTest chara = new CharacterTest();
        chara.escape();
        chara.methods();
    }
}