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
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<vi> vvi;
typedef vector<vl> vvl;
typedef vector<double> vd;
typedef vector<vd> vvd;
typedef pair<int, int> pii;
typedef pair<double, double> pdd;
typedef vector<pii> vii;
typedef vector<string> vs;
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
    int t;
    scanf("%d",&t);
    while(t-->0){
        int d;
        scanf("%d",&d);
        if(d%9==0 && d!=9){
            printf("1\n");
            continue;
        }
        d++;
        int sum=0;
        while(d>0){
            sum+=d%10;
            d/=10;
            //printf("%d\n",d);
        }

        printf("%d\n",sum);
    }
    return 0;
}
