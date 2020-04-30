// 抽象类、多态
public class polymorphicTest {
    public static void main(String args[]) {
        // Akun c = new Akun();
        // Asen d = new Asen();
        // c.eat();
        // d.work();
        show(new Akun());
    }

    public static void show(Creature a) {
        if (a instanceof Akun) {
            Akun c = (Akun) a;
            c.eat();
            c.work();
        } else if (a instanceof Asen) {
            Asen d = (Asen) a;
            d.eat();
        }
    }
}

abstract class Creature {
    abstract void eat();
}

class Akun extends Creature {
    public void eat() {
        System.out.println("唱、跳、rap");
    }

    public void work() {
        System.out.println("鸡你太美");
    }
}

class Asen extends Creature {
    public void eat() {
        System.out.println("篮球");
    }

    public void work() {
        System.out.println("吉利太慢");
    }
}