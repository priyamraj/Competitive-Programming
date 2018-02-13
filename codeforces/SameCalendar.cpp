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
inline bool isLeap(int x){
  if(x%400 == 0) return true;
  if(x%4==0 && x%100!=0) return true;
  return false;
}

int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int yr;
	cin >> yr;
	int odddays=0,currdays=0;
	if(isLeap(yr)) currdays=366;
	else currdays=365;
	while(true){
        yr++;
        int days=(isLeap(yr))?366:365;
        if(days==366) odddays+=2;
        else odddays+=1;
        if(odddays>=7) odddays%=7;
        if(days==currdays && odddays==0){
            cout << yr << endl;
            break;
        }
	}
	return 0;
}

