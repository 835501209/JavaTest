public class mathTest{
    
    public mathTest(){

    }

    //改变Number对象类型
    public void xValues(){
        Integer a = 1;   //调用数学方法改变某数据的类型时，用包装类进行包装
        System.out.println(a.byteValue());
        System.out.println(a.shortValue());
        System.out.println(a.floatValue());
    }

    //将Number对象与方法参数比较
    public void compare(){
        Integer a = 6;
        System.out.println(a.compareTo(4));  //返回1，大于
        System.out.println(a.compareTo(6));  //返回0，等于
        System.out.println(a.compareTo(8));  //返回-1，小于
    }

    //判断Number对象与方法参数是否相等，布尔值
    public void equal(){
        Integer a = 6;
        System.out.println(a.equals(8));
        System.out.println(a.equals(6));
    }

    //改变为Number对象类型
    public void valuesOf(){
        System.out.println(Integer.valueOf(8));
    }

    //返回一个字符串表示的Number对象
    public void tostring(){
        Integer a = 3;
        System.out.println(a.toString());
        System.out.println(Integer.toString(3));
    }

    //将字符串参数作为有符号的十进制整数进行解析
    public void parseint(){
        System.out.println(Integer.parseInt("3")); 
    }

    //返回参数的绝对值
    public void absolute(){
        System.out.println(Math.abs(3)); 
        System.out.println(Math.abs(-3)); 
    }

    //取整方法
    public void rounded(){
        System.out.println(Math.ceil(3.4)); //向上取整
        System.out.println(Math.floor(3.4)); //向下取整
        System.out.println(Math.rint(3.4)); //返回最接近的整数。double类型
        System.out.println(Math.round(3.4)); //四舍五入
    }

    //比较大小
    public void maxmin(){
        System.out.println(Math.max(3,4));
        System.out.println(Math.min(3,4));
    }
    
    //自然指数e
    public void EXPLOG(){
        int a = 2;
        double b = 7.3891;
        System.out.printf("e 的值为 %.2f%n", Math.E);
        System.out.printf("e的平方：%.4f%n",Math.exp(a));
        System.out.printf("e的平方：%f%n",Math.log(b));
    }

    public static void main ( String []args){
        mathTest maths = new mathTest();
        // maths.xValues();
        // maths.compare();
        // maths.equal();
        // maths.valuesOf();
        // maths.tostring();
        // maths.parseint();
        // maths.absolute();
        // maths.rounded();
        // maths.maxmin();
        maths.EXPLOG();
    }
}