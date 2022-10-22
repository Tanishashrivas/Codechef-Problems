/*Ques: https://www.codechef.com/submit/JOHNY*/
#include <iostream>
#include<algorithm>
using namespace std;

int main() {
	int t,n,k,temp;
	cin>>t;
	while(t--){
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];
	    cin>>k;
	   temp=arr[k-1];
	   
	   sort(arr,arr+n);
	   for(int i=0;i<n;i++){
	       if(arr[i]==temp){
	       cout<<i+1<<endl;
	       break;
	       }
	   }
	    
	}
	return 0;
}
