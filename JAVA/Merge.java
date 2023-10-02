import java.util.Arrays;

class Merge {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(MergeSort(arr)));
    }
     public static int[] MergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        else {
            int mid = arr.length / 2;
            int[] first = MergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] last = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(first, last);
        }
    }
    static int[] merge(int[] first , int[] last){
        int[] ans = new int[first.length + last.length];
        int i =0;
        int j =0;
        int k =0;
        while (i < first.length && j < last.length){
            if (first[i] < last[j]){
                ans[k] = first[i];
                i++;
                k++;
            } else if (first[i] > last[j]) {
                ans[k] = last[j];
                j++;
                k++;
            }
        }
        while(i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j < last.length){
            ans[k] = first[j];
            j++;
            k++;
        }
        return ans;
    }
}