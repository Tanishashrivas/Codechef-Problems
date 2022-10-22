/*Ques: https://www.codechef.com/submit/ATTENDU?tab=statement*/
#include <iostream>
using namespace std;

int main() {
int t,n;
string s;
cin>>t;
while(t--){
    int count=0;
    cin>>n>>s;
    
    for(int i=0;i<n;i++){
        if(s[i]=='0')
        count++;
    }
    // cout<<count;
    if(count>30)
    cout<<"NO"<<endl;
    else
    cout<<"YES"<<endl;
    
}
	return 0;
}
