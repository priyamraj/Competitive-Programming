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
const int mx=5000007;
int s[mx];
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	for(int i=3;i<mx;i+=2) s[i]=1;
	s[2]=1;
	for(int i=3;i*i<mx;i+=2){
        if(s[i]==1)
        for(int j=i*i;j<mx;j+=i+i)
        s[i]=0;
	}
	int n;
	cin >> n;
	for(int i=2;i<mx;i++){
        if(s[i]==1){cout << i << " ";n--;}
        if(n==0)
            break;
	}
	return 0 ;
}
