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
	cin >> n;
	int arr[n];
	for(int i=0;i<n;i++)
        cin >> arr[i];
    int mx=-1;
    for(auto x:arr){
        mx=max(mx,x);
    }
    int c=0;
    for(auto x:arr){
        if(x==mx)
            c++;
    }
    if(c%2==0) cout << "Agasa" << endl;
    else cout << "Conan" << endl;
	return 0;
}
