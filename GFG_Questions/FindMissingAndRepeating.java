import java.io.*;
import java.util.*;

class FindMissingAndRepeating {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

class Solve {
    int[] findTwoElement(int arr[], int n) {
     int[] res=new int[2];
     HashSet<Integer> hs=new HashSet<>();
     for(int i=1;i<=n;i++)
     {
         hs.add(i);
     }
     for(int j=0;j<arr.length;j++)
     {
         if(hs.contains(arr[j]))
         {
             hs.remove(arr[j]);
         }
         else
         {
             res[0]=arr[j];
         }
     }
    for(int s:hs)
    {
        res[1]=s;
    }
     return res;
    }
}