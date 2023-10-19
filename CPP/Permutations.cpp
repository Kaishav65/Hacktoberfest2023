/*Problem link and solution for Permutations in CSES*/
/*https://cses.fi/problemset/task/1070/ */
/*Most Welcome for any other solutions too */

#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    if(n==4)
        cout<<2<<" "<<4<<" "<<1<<" "<<3;
    else if(n<4 && n!=1){
        cout<<"NO SOLUTION"<<endl;}
    else{
        int arr[n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        for(int i=0;i<n;i=i+2)
            cout<<arr[i]<<" ";
        for(int i=1;i<n;i=i+2)
            cout<<arr[i]<<" ";  }        
}
