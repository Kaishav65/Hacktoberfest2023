
//This is binary search implementation on user defined input which has a time complexity of O(log n).
//Hope this helps.


import java.util.*;
public class binarySearch{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
         int arr[]=new int[n];
        System.out.println("enter sorted value in array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value to be searched :");
        int x=sc.nextInt();
        sc.close();
        binsearch(arr,x);


    }
    public static void binsearch(int arr[],int x){
        int l=0,u=arr.length-1;
        while(l<=u){
            int mid=(l+u)/2;
            if(arr[mid]==x){
                System.out.println("Element found at index :"+mid);
                break;
            }
            else if(x>arr[mid]){
                l=mid+1;
            }
            else{
                u = mid-1;
            }

        }
        if(l>u){
            System.out.println("Element not found");
            
        }

    }
}