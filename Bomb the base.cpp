/*Ques: In Chefland, there are N houses numbered from 11 to NN, i^{th}
  house has a defence system having strength A_i.
Chef suspects a bomb drop on one of the houses very soon. A bomb with attack strength XX can destroy the i^{th}
  house, if the defence system of the i^{th}house A_i,is strictly less than X.

Also, when the i^{th}house is destroyed due to the bomb, all houses with indices j such that 1≤j<i get destroyed as well irrespective of their defence system.
Given one bomb with attack strength X, find the maximum number of houses that can get destroyed.*/

#include <iostream>
using namespace std;

int main() {
	int t,n,x;
	cin>>t;
	while(t--){
	    int count=0;
	    cin>>n>>x;
	    int a[n];
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    
	    for(int i=0;i<n;i++){
	        if(a[i]<x)
	        count=i+1;
	    }
	    
	    cout<<count<<endl;
	    
	}
	return 0;
}
