public class DataType{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    char h;
    public static void main(String[] args){
        DataType one = new DataType(); 
        // one.DataType();
    }
    public DataType(){
        System.out.println("a"+this.a);
        System.out.println("b"+this.b);
        System.out.println("c"+this.c);
        System.out.println("d"+this.d);
        System.out.println("e"+this.e);
        System.out.println("f"+this.f);
        System.out.println("g"+this.g);
        System.out.println("h"+this.h);
    }
}