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
static vector<int> ts;
static unordered_set<int> hs[mx];

int dfs(int v){
  int ret=1;
  vector<int> temp;
  for(int i=0;i<ts.size();i++){
    unordered_set<int>::iterator it=hs[v].find(ts[i]);
    if(it == hs[v].end())
      temp.push_back(ts[i]);
  }

  for(int i=0;i<temp.size();i++)
    ts.erase(ts.begin(),ts.end(),temp[i]);

  for(int i=0;i<temp.size();i++)
    ret+=dfs(temp[i]);

  return ret;
  
}

int main(){
 	ios_base::sync_with_stdio(0);
 	cin.tie(0);cout.tie(0);
 	cin>>n>>m;

  for(int i=1;i<=n;i++)
    ts.push_back(i);

    for(int i=0;i<m;i++){
        int v1,v2;
        cin>>v1>>v2;
        hs[v1].insert(v2);
        hs[v2].insert(v1);
    }

    int cons=0;
    vector<int> res;
    while(!ts.empty()){
      cons++;
      int val=ts[0];
      res.push_back(dfs(val));
      ts.erase(ts.begin(),ts.end(),val);
    }
    cout << cons << endl;
    sort(res.begin(),res.end());
    for(int i=0;i<res.size();i++)
      cout << res[i] << " ";
    return 0;
}
