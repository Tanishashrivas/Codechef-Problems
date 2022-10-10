/*Question:The college can be visualized on a 2D-plane. Suppose the College Main Gate is situated at origin i.e. 
at the coordinates (0, 0)and the Hostel is situated at the coordinates (x,y).
As the first-year student wants to explore the college campus further, in one move, he will increase or decrease any 
coordinate (either the x-coordinate or the y-coordinate) by a value of exactly K.
Is it possible for the first-year student to reach the Hostel? */

#include <iostream>
using namespace std;

int main() {
	int t,x,y,k;
	cin>>t;
	while(t--){
	    cin>>x>>y>>k;
	    if(x%k==0 && y%k==0)
	    cout<<"YES"<<endl;
	    else
	    cout<<"NO"<<endl;
	}
	return 0;
}
