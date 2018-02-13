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
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int n;
	cin >> n;
	int re[n];
	int arr[n];
	int rot[n]; // 0 for cw, 1 for acw
	for(int i=0;i<n;i++){
        re[i]=i;
        rot[i]=(i%2==0)?0:1;
        cin >> arr[i];
	}
	for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int v=arr[j];
            if(rot[j]==0){
                v++;
                if(v>=n) v%=n;
            }
            else{
                v--;
                if(v<0) v+=n;
            }
            arr[j]=v;
        }//end of j
        //for(auto x:arr){cout << x << " : ";} cout << endl;
        bool b=true;
        for(int k=0;k<n;k++){
            if(re[k]!=arr[k]){b=false;break;}
        }
        if(b){cout << "Yes" << endl; return 0;}
	}
	cout << "No" << endl;
	return 0;
}

