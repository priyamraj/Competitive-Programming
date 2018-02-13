#include <cstdio>
#include <cstdlib>
#include <cassert>
#include <iostream>
#include <set>
#include <vector>
#include <cstring>
#include <string>
#include <algorithm>
#include <numeric>
#include <cmath>
#include <complex>
#include <map>
#include <queue>
#include <limits.h>
#define endl "\n"
using namespace std;
typedef long long ll;
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int n,pos,l,r;
	cin >> n >> pos >> l >> r;
	//full
	if(r-l+1 == n){
        cout << 0 << endl;
        return 0;
	}
	//inside
	else if(pos>=l && pos<=r){
        int x=l,y=r,ans=0,p=pos;
        if(l==1){
            ans=r-pos+1;
        }
        else if(r==n){
            ans=pos-l+1;
        }
        else if(p-x < y-p && x!=1){
            if(x!=1)
                ans+=(p-x+1);
            if(y!=n)
                ans+=(y-x+1);
        }
        else if(p-x>=y-p && y!=n){
            if(y!=n)
                ans+=(y-p+1);
            if(l!=1)
                ans+=(y-x+1);

        }
        cout << ans << endl;
        return 0;
	}
	//to left
	else if(pos<l){
        int ans=(l-pos)+1;
        if(r!=n)
           ans+=(r-l+1);
        cout << ans << endl;
        return 0;
	}
	//to right
	else{
        int ans=(pos-r)+1;
        if(l!=1)
           ans+=(r-l+1);
        cout << ans << endl;
        return 0;
	}
	return 0;
}

