/*
  Given two integers, n and m, representing the number of rows and columns in a maze, the objective is to identify and list all possible paths to navigate from the top-left corner to the bottom-right corner of the maze.
  
  There are specific constraints to be considered:
  Two types of moves are allowed:
  'h' - Signifying a horizontal move, allowing one step to the right.
  'v' - Signifying a vertical move, enabling one step downward.
  This program generates and presents a comprehensive list of all valid paths that conform to these constraints for maze traversal.

  Sample Input
  3
  3
  
  Sample Output
  [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
  
*/

import java.io.*;
import java.util.*;

public class Solution {
    static void generate(int i, int j, int n, int m, String curr, ArrayList<String> ans){
        if(i==n-1 && j==m-1){
            ans.add(curr);
            return;
        }
        if(i==n || j==m){
            return;
        }
        generate(i, j+1, n, m, curr+'h', ans);
        generate(i+1, j, n, m, curr+'v', ans);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> ans=new ArrayList<String>();
        String curr="";
        int i=0, j=0;
        generate(i, j, n, m, curr, ans);
        System.out.println(ans);
    }
}

//TC:O(2^(n*m))
//SC: O(n*m)
