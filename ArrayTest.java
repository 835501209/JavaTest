public class ArrayTest {
    public ArrayTest() {

    }

    public static int[] printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public int[] sort(int yrr[]) {
        for (int i = 0; i < yrr.length; i++) {
            for (int j = 0; j < yrr.length - i - 1; j++) {
                if (yrr[j] < yrr[j + 1]) {
                    int k = yrr[j];
                    yrr[j] = yrr[j + 1];
                    yrr[j + 1] = k;
                }
            }
        }
        return yrr;
    }

    public void multidimensional(){
        String zrr[][] = new String[2][2];
        zrr[0][0] = "top";
        zrr[0][1] = "mid";
        zrr[1][0] = "bottom";
        zrr[1][1] = "gank";
    }
    public static void main(String args[]) {
        ArrayTest arr = new ArrayTest();
        // printArray(new int[]{3, 1, 2, 6, 4, 2});
        // int[] seven = arr.sort(new int[] { 3, 1, 2, 6, 4, 2, 4, 2 });

        // for (int i = 0; i < seven.length; i++) {
        //     System.out.print(seven[i] + " ");
        // }

        //for-Each循环
        // for(int key:seven){
        //     System.out.print(key+" ");
        // }

        //多维数组
        arr.multidimensional();
    }
}