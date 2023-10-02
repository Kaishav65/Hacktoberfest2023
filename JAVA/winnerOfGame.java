class Solution {
    public boolean winnerOfGame(String s) {
        int n = s.length();
        if(n<=2)return false;
        char[] ch = s.toCharArray();

        int a = count(ch,'A');
        int b = count(ch,'B');
        if(a>b)return true;
        return false;
    }
    public int count(char[]ch,char c){
        int n = ch.length;
        int count=0;
        for(int i=1;i<n-1;i++){
            if(ch[i]==c && (ch[i-1]==ch[i] && ch[i]==ch[i+1])){
                count++;
            }
        }
        return count;
    }
}