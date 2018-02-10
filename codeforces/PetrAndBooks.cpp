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
	int days[7];
	for(int i=0;i<7;i++) cin>>days[i];
	int t=0,i=0,ans=-1;
	while(true){
       t+=days[i];
       if(t>=n){ans=i+1;break;}
       i++;
       if(i>=7) i%=7;
	}
	cout << ans;
	return 0 ;
}
