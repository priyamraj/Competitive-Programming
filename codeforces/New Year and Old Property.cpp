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
    ll a, b;
    int ans = 0;
    cin >> a >> b;
    for (int d = 2; d <= 61; d++)
    {
        for (int s = 0; s < d - 1; s++)
        {
            ll v = (1LL << d) - 1 - (1LL << s);
            if (v >= a && v <= b)
                ans++;
        }
    }
    cout << ans << endl;
    return 0;
}
