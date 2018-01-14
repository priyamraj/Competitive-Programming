#include <iostream>
#include <vector>
#include <cstring>
#include <cstdio>
#define endl "\n"
typedef long long int lli;
using namespace std;
const int MAX=10000007;
short v[MAX];
int len, sp[MAX];

void Sieve(){
	for (int i = 2; i < MAX; i += 2)	{sp[i] = 2;v[i]=1;}//even numbers have smallest prime factor 2
	for (lli i = 3; i < MAX; i += 2){
		if (!v[i]){
			sp[i] = i;
			for (lli j = i; (j*i) < MAX; j += 2){
				if (!v[j*i])	{v[j*i] = 1; sp[j*i] = i;}
			}
		}
	}
}
void factorize(int n){
	while(n!=1){
		printf("%d\n",sp[n]);
		n/=sp[n];
	}
}
int main(){
	Sieve();
	for (int i = 0; i < 50; i++)	cout << sp[i] << endl;
	factorize(50);
    return 0;
}
