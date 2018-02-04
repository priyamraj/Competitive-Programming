#include <cstdio>
#include <iostream>
#include <vector>
#include <set>
#include <map>
#include <cmath>
#include <string>
#include <cstring>
#include <sstream>
#include <queue>
#include <iomanip>
#include <algorithm>
using namespace std;
const int mx=300007;
static int mark[mx];
static int dp[26][mx];
vector<int> adj[mx];
vector<int> topo;

bool cycle(int v){
	if(mark[v]==2) return false;
	if(mark[v]==1) return true;
	mark[v]=1;
	for(int i=0;i<adj[v].size();i++)
		if(cycle(adj[v][i])) return true;
	mark[v]=2;
	topo.push_back(v);
	return false;
}
int main(){
	ios_base::sync_with_stdio(0); cin.tie(0);cout.tie(0);
	int n,m;
	cin>>n>>m;
	string s;
	cin>>s;
	s="%"+s;
	for(int i=0;i<m;i++){
		int x,y;
		cin>>x>>y;
		adj[x].push_back(y);
	}
	//cycle found
	for(int i=1;i<=n;i++){
		if(cycle(i)){cout<<"-1"<<endl;return 0;}
	}
	int answer=0;
	for(int i='a';i<='z';i++){
		for(int j=0;j<topo.size();j++){
			int v=topo[j];
			int val=0;
			if(i==s[v])
				val=1;
			dp[i-'a'][v]=val;
			for(int k=0;k<adj[v].size();k++)
				dp[i-'a'][v]=max(dp[i-'a'][v], dp[i-'a'][adj[v][k]]+val);
			answer=max(answer,dp[i-'a'][v]);
		}//end of j
	}//end of i
	cout << answer << endl;
	return 0;
}
