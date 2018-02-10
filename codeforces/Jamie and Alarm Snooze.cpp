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
inline contains(int hh,int mm){
  int d;
  bool b=false;
  while(hh>0){
    d=hh%10;
    if(d==7) b=true;
    hh/=10;
  }
  if(b) return b;
  while(mm>0){
    d=mm%10;
    if(d==7) b=true;
    mm/=10;
  }
  if(b) return true;
  return false;
}
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int hh,mm;
	int x,ans=0;
	cin >> x >> hh >> mm;
	while(true){
        if(contains(hh,mm)){
          //cout << hh << mm ;
          break;
        }
        ans++;
        mm-=x;
        if(mm<0){mm+=60;hh--;}
        if(hh<0){hh+=24;}
	}
	cout << ans;
	return 0 ;
}
