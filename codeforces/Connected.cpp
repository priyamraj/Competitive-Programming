#include<unordered_set>
#include <cstdio>
#include <cstdlib>
#include <cassert>
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
#include<iostream>
using namespace std;
static const int mx=200007;
static int n,m,ans;
static int done[mx];
static map<int, unordered_set<int> > hs;

void dfs(int v){
  if(done[v]) return;
  done[v]=1;
  ans++;
  for(int i=1;i<=n;i++){
    if(v==i || done[i]==1) continue;
    if(hs[v].find(i) == hs[v].end())
        dfs(i);
  }
}

int main(){
 	ios_base::sync_with_stdio(0);
 	cin.tie(0);cout.tie(0);
 	cin>>n>>m;
 	memset(done,0,mx);
    for(int i=1;i<=n;i++) hs[i].insert(-1);
    for(int i=0;i<m;i++){
        int v1,v2;
        cin>>v1>>v2;
        hs[v1].insert(v2);
        hs[v2].insert(v1);
    }
    int cons=0;
    vector<int> res;
    for(int i=1;i<=n;i++){
      if(done[i]) continue;
      ans=0;
      dfs(i);
      cons++;
      res.push_back(ans);
    }
    sort(res.begin(),res.end());
    cout << cons << endl;
    for(int i=0;i<res.size();i++)
        cout << res[i] << " ";
    return 0;
}
