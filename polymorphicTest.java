public class polymorphicTest{
    public  static void main(String args[]){

    }
    public void show(Animal a){
        if(a instanceof Akun){
            Akun c = (Akun)a;
            c.eat();
            c.work();
        }
        else if(a instanceof Asen){
            Asen d = (Asen)a
        }
    }
}
abstract class Animal{
    abstract void eat();
}
class Akun extends Animal{
    public void eat(){
        System.out.println("唱、跳、rap");
    }
    public void work(){
        System.out.println("鸡你太美");
    }
}

class Asen extends Animal{
    public void eat(){
        System.out.println("篮球");
    }
    public void work(){
        System.out.println("吉利太慢");
    }
}