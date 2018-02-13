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
#include <set>
#include <unordered_set>
#include <map>
#include <queue>
#include <limits.h>
#define endl "\n"
using namespace std;
typedef long long ll;
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	int n;
	cin >> n;
	ll arr[n+1]={0};
	ll sorted[n+1]={0};
    for(int i=1;i<=n;i++){
        cin >> arr[i];
        sorted[i]=arr[i];
    }
    sort(sorted,sorted+n+1);
    for(int i=1;i<=n;i++)
        arr[i]+=arr[i-1];
    for(int i=1;i<=n;i++)
        sorted[i]+=sorted[i-1];
    int q;
    cin >> q;
    while(q-->0){
        int t,l,r;
        cin >> t >> l >> r;
        if(t==1)
            cout << arr[r]-arr[l-1] << endl;
        else
            cout << sorted[r]-sorted[l-1] << endl;
    }
	return 0;
}

