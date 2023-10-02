
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr={4,1,3,9,7};
        selectionArr(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap it with correct index
            int last=arr.length-i-1;
            int maxInd=getMaxInd(arr,0,last);
            swap(arr, maxInd, last);
        }
    }
    static int getMaxInd(int[]arr,int start,int last){
        int max=start;
        for (int i = start; i<=last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}