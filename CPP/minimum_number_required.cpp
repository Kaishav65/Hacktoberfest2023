#include <bits/stdc++.h> 
int findMinNumbers(vector<int> &arr, int sum, int maxVal) {
	int req = 0;
	for(int i=0; i<arr.size(); i++){
		req += arr[i];
	}

	req = abs(sum-req);
	if(req==0)	return 0;
	if(req%maxVal!=0){
		return req/maxVal+1;
	}else{
		return req/maxVal;
	}

}
