//Problem -Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int i,lsum=0,sum=0;
        for(i=0;i<n;i++)
            sum+=arr[i];
            
        for(i=0;i<n;i++){
            
            if(lsum==sum-lsum-arr[i])
                return i+1;
            lsum+=arr[i];
        }
        return -1;
    }
