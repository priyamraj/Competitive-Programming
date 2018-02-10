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
inline bool isTri(int a,int b,int c){
 if(a+b>c && a+c>b && b+c>a)
      return true;
    return false;
}
int main(){
    int n,ans=0;;
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	cin >> n;
	for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            int k=i^j;
            if(isTri(i,j,k) && k<=n && k>=j)
                ans++;
        }
	}
	cout << ans;
	return 0 ;
}
