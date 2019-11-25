public class Emp{
    String name;
    int age;
    String des;
    public Emp(String name,int agess,String desss){
        this.name = name; //不使用this时，默认先从当前函数寻找变量，找不到再从类里面寻找，当有同名变量是，需要使用this来表明使用类的变量
        this.age =  agess;
        des  = desss;
    }
    public void printEmp(){
        System.out.println("我叫"+name);
        System.out.println("年龄"+age);
        System.out.println("爱好"+des);
    }
}