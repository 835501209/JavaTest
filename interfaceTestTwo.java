//接口：类继承并实现接口的方法

public class interfaceTestTwo implements InterfaceTest {
  public void eat(){
    System.out.println("eat");
  }
  public void look(){
    System.out.println("look");
  }
  public void listen(){
    System.out.println("listen");
  }

  public static void main(String args[]){
    interfaceTestTwo m = new interfaceTestTwo();
    m.eat();
    m.look();
    m.listen();
  }
}