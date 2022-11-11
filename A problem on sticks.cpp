/*Ques: https://www.codechef.com/submit/TREE2?tab=statement*/

#include <iostream>
#include<algorithm>
using namespace std;

int main() {
	int t,n;
	cin>>t;
while(t--){
    cin>>n;
    int arr[n],c=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr,arr+n);
    for(int i=0;i<n-1;i++){
     if(arr[i]!=arr[i+1])
	        c++;
    }
    // cout<<c;
    if(arr[0]==0)
    cout<<c<<endl;
    else
    cout<<c+1<<endl;
}	
return 0;
}
