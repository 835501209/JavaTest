public class Dog{
    String kind;
    String names= "akun";
    int age;
    String color;
    public void hobby(String hobby){
        System.out.println("大家好，我是练习时长两年半的个人练习生"+names+",我的爱好是："+hobby);
    }
    public Dog(String name){
        System.out.println("狗名为："+name);
    }
    
    public static void main(String[] args){
        Dog myDog = new Dog("akun");
        myDog.hobby("唱、跳、rap、篮球");
    }
}