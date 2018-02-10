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
	int days,total;
	cin >> days >> total;
	int arr[days][3];
	for(int i=0;i<days;i++){
        cin >> arr[i][0] >> arr[i][1];
        arr[i][2]=0;
	}
	for(int i=0;i<days;i++){
        if(total<0){cout << "NO" << endl; return 0;}
        arr[i][2]=arr[i][0];
        total-=arr[i][0];
	}
	for(int i=0;i<days && total>0;i++){
        if(arr[i][2] == arr[i][1]) continue;
        if(arr[i][1]-arr[i][2] <= total){
            total-=arr[i][1]-arr[i][2];
            arr[i][2]=arr[i][1];
        }
        else if(arr[i][1]-arr[i][2] > total){
            arr[i][2]+=total;
            total=0;
        }
	}
	if(total!=0){cout << "NO" << endl; return 0;}
	cout << "YES" << endl;
	for(int i=0;i<days;i++)
        cout << arr[i][2] << " ";
	return 0 ;
}
