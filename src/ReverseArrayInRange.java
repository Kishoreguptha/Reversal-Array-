import java.util.Scanner;

public class ReverseArrayInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        reverseFunction(size,array,B,C);
        for(int x:array)
        {
            System.out.print(x+" ");
        }
    }
    public static void reverseFunction(int size,int[] array,int b, int c){
        int i = b;
        int j = c;
        while (i<j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
