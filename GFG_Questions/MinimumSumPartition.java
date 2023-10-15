//User function Template for Java

class Solution
{

static int solve(int []arr,int i,int j, int ic, int jc, Integer dp[][]){
    if(i == arr.length){
        return Math.abs(ic-jc);
    }
    if(dp[i][ic]!=null)return dp[i][ic];
    
    return dp[i][ic] = Math.min(solve(arr,i+1,j+1,ic+arr[i],jc,dp),solve(arr,i+1,j+1,ic,jc+arr[j],dp));
}
	public int minDifference(int arr[], int n) 
	{ 
	 int sum = 0;
	    for(int i:arr)sum+=i;
	Integer dp[][] = new Integer[n][sum];
	return solve(arr,0,0,0,0,dp);
	    
	} 
}
