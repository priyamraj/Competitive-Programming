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
static int iscap[100007];
static vector<int> caps;
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
    int cities,capitals;
    cin >> cities >> capitals;
    int beauty[cities+1];
    for(int i=1;i<=cities;i++)
        cin >> beauty[i];
    for(int i=0;i<capitals;i++){
        int k;
        cin >> k;
        caps.push_back(k);
        iscap[k]=1;
    }
    ll sum=0;
    for(int i=1;i<=cities;i++)
        sum+=beauty[i];
    ll ans=0;
    for(int i=0;i<caps.size();i++){
        ans+=beauty[caps[i]]*(sum-beauty[caps[i]]);
        sum-=beauty[caps[i]];
    }
    for(int i=2;i<=cities;i++){
        if(iscap[i]!=1 && iscap[i-1]!=1)
            ans+=beauty[i]*beauty[i-1];
    }
    if(iscap[cities]!=1 && iscap[1]!=1)
        ans+=beauty[cities]*beauty[1];
    cout << ans;
	return 0;
}
