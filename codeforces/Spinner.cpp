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
	map<char,int> mp;
	mp['v']=0;
	mp['<']=1;
	mp['^']=2;
	mp['>']=3;
	char arr[]={'v','<','^','>'};
	char st,en;
	cin >> st >> en;
	int n;
	cin >> n;
	n=n%4;
	int cw=(mp[st]+n)%4;
	char pcw=arr[cw];
	int ccw=(mp[st]-n);
	if(ccw<0) ccw+=4;
	char pccw=arr[ccw];

	if(en==pcw && en!=pccw) cout << "cw";
	else if(en==pccw && en!=pcw) cout << "ccw";
	else cout << "undefined";
	return 0 ;
}

