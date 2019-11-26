public class Test {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Test tt = new Test();
        // tt.change();
        // tt.switchData();
        tt.arrayData();
    }

    public Test() {
        // System.out.println("a==b?：" + (a == b));

    }

    public void change() {
        System.out.println("a==b?：" + (this.a == this.b));
    }

    public void switchData() {
        int i = 2;
        switch (i) {
        case 0:
            System.out.println("0");
        case 1:
            System.out.println("1");
        case 2:
            System.out.println("2");
        default:
            System.out.println("default");
        }
    }
    public void arrayData(){
        int []  arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]="+arr[i]);
            System.out.println("\n");
        }
    }
}