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
	int n;
	cin>>n;
	// number of moves accrued from any no. are n-1. check by drawing trees
	ll suf[n];
	for(int i=0;i<n;i++)
        {cin>>suf[i];suf[i]--;}
    for(int i=1;i<n;i++)
      suf[i]+=suf[i-1];
    for(int i=0;i<n;i++){
        if((suf[i]&1)==0) cout << 2;
        else cout << 1;
        cout << endl;
    }
	return 0 ;
}
