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
    ll k,l,d,ans=0;
    cin >> k >> l;
    while(l>1){
        d=l%k;
        if(d!=0){cout << "NO" << endl;return 0;}
        ans++;
        l/=k;
    }
    cout << "YES" << endl;
    cout << ans-1;
	return 0 ;
}

