/*Ques: https://www.codechef.com/submit/TSTROBOT?tab=statement*/
#include<bits/stdc++.h>
using namespace std;

int main() {
	int t,n,x;
	string s;
	cin>>t;
	while(t--){
	    cin>>n>>x>>s;
	    int arr[n+1],count=0;
	    arr[0]=x;
	    int len= sizeof(arr)/sizeof(arr[0]);
	    for(int i=0;i<n;i++){//since the length of the string is n
	        if(s[i]=='L'){
	        arr[i+1]=x-1;
	        x--;
	        }
	        else {
	        arr[i+1]=x+1;
	        x++;
	        }
	        }
	        sort(arr,arr+len);
	    for(int i=0;i<len;i++){
	        if(arr[i]!=arr[i+1])
	        count++;
	    }
	    cout<<count<<endl;
	}
	return 0;
}
