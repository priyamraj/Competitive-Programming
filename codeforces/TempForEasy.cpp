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
    int a,b,c,x,y,z;
    cin>>a>>b>>c>>x>>y>>z;
    int p=max(a-x,0)/2 + max(b-y,0)/2 + max(c-z,0)/2;
    int n=max(x-a,0) + max(y-b,0) + max(z-c,0);
    if(p>=n) cout << "Yes";
    else cout << "No";
	return 0 ;
}

