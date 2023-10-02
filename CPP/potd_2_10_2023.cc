(* Number of distinct subsequences
Given a string consisting of lower case English alphabets, the task is to find the number of distinct subsequences of the string
Note: Answer can be very large, so, ouput will be answer modulo 109+7. *)

class Solution{
  public:
  int mod = 1e9+7;
    // int f(int ind,string ss,string s,set<string> &st){
    //     if(ind==s.size()){
    //         if(st.find(ss)==st.end()){
    //           st.insert(ss);
    //           return 1; 
    //         }
    //         return 0;
    //     }
    //     ss.push_back(s[ind]);
    //     int notTake = f(ind+1,ss,s,st);
    //     ss.pop_back();
    //     int take = f(ind+1,ss,s,st);
    //     return (take+notTake)%mod;
    // }
	int distinctSubsequences(string s)
	{
	    int n = s.size();
	    map<char,int> m;
	    vector<int> dp(n+1,0);
	    dp[0] = 1;
	    for(int i=1; i<=n; i++){
	        dp[i] = (dp[i-1]*2)%mod;
	        char ch = s[i-1];
	        if(m.find(ch)!=m.end()){
	            dp[i] = (dp[i]-dp[m[ch]-1]+mod)%mod;
	        }
	        m[ch] = i;
	    }
	    return dp[n];
	}
};
