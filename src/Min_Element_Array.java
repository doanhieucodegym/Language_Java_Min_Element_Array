import java.util.Scanner;

public class Min_Element_Array {
    public static float[] input(float[]arr){
        System.out.println("Nhập  số phần tử của mảng");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        arr = new float[n];
        for(int i=0 ; i <n;i++){
            System.out.printf("array[%d] =",i);
            arr[i] =sc.nextFloat();
        }
        return arr;
    }
    public static void show(float []arr){
        for(int i =0; i <arr.length;i++){
            System.out.print(arr[i]+"\t ");
        }
        System.out.println();
    }
    public static  float min_Elemen(float []arr){
            float min =arr[0];
            for (int i =0 ; i<arr.length;i++){
                if(min >arr[i]){
                    min =arr[i];
                }

            }
            return min;

    }

    public static void main(String[] args) {
        float [] array =null;
        System.out.println("Nhập số phần tử mảng");
        array= input(array);
        System.out.println("Show phần tử mảng");
        show(array);
        System.out.println("phần tư  nhỏnhất");
         float min = min_Elemen(array);
        System.out.println("tìm được phần tử nhỏ  nhất "+min);
    }
}
