class Animal {
    void eat() {
        System.out.println("animal : eat");
    }
}

class Cat extends Animal { // 注意类名不要和其他的重复，其他文件也不行
    // void eat() {             //父类拥有的方法，字类不重写的情况下默认继承父类的方法
    //     System.out.println("cat : eat");
    // }

    // void eatTest() {
    // this.eat(); // this 调用自己的方法
    // super.eat(); // super 调用父类方法
    // }
}

class Pig extends Cat {
    void eat() {
        System.out.println("pig:eat");
    }

    void eatTest() {
        this.eat(); // this 调用自己的方法
        super.eat(); // super 调用父类方法
    }
}

public class ExtendTest {
    public static void main(String[] args) {
        // Animal a = new Animal();
        // a.eat();
        // Cat d = new Cat();
        // d.eat();
        Pig e = new Pig();
        // e.eatTest();
        e.eat();
    }
}
