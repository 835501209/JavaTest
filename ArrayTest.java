public class ArrayTest{
    public ArrayTest(){
      
    }

    public static int[] printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public int[] sort(int[] yrr){
        for(int i=0;i<yrr.length-1;i++){
            for(int j=0;j<yrr.length - i-1;j++){
                if( yrr[j] < yrr[j+1]){
                    int k = yrr[j];
                    yrr[i] = yrr[j+1];
                    yrr[j+1] = k;
                }
            }
        }
        return yrr;
    }

    public static void main (String[] args){
        ArrayTest arr = new ArrayTest();
        // printArray(new int[]{3, 1, 2, 6, 4, 2});
        int[] seven = arr.sort(new int[]{3, 1, 2, 6, 4, 2});
        for (int i = 0; i < seven.length; i++) {
            System.out.print(seven[i] + " ");
          }
    }
}