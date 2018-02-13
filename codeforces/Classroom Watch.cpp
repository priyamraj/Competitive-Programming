
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
int sod(int n){
  int d,s=0;
  while(n>0){
    d=n%10;
    s+=d;
    n/=10;
  }
  return s;
}
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	int n,c=0;
	cin >> n;
	vector<int> ans;
	for(int i=1;i<=100;i++){
        if(sod(n-i)==i)
            ans.push_back(n-i);
	}
    cout << ans.size() << endl;
    sort(ans.begin(),ans.end());
    for(auto x:ans)
        cout << x << endl;
	return 0;
}
