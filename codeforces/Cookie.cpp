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
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<vi> vvi;
typedef vector<vl> vvl;
typedef vector<double> vd;
typedef vector<vd> vvd;
typedef pair<int, int> pii;
typedef pair<double, double> pdd;
typedef vector<pii> vii;
typedef vector<string> vs;
int main(){
    ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    ll sum=0;
    for(int i=0;i<n;i++) sum+=arr[i];
    ll ans=0;
    for(int i=0;i<n;i++){
        if((sum-arr[i])%2==0) ans++;
    }
    cout << ans;
	return 0 ;
}
