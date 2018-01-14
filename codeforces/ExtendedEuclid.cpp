#include <stdio.h>
#include <iostream>
typedef long long int ll;
using namespace std;
static int x,y,d;
void printSolutions(int a,int b){
   int n=0;
   printf("gcd %d\n",d);
    printf("%d %d\n",x,y);
    while(true){
        n++;
        int x1=x+(b/d)*n;
        int y1=y-(a/d)*n;
        if(x1>0 && y1>0)
        {printf("%d %d",x1,y1);break;}
    }
}
void extendedEuclid(int a, int b) {
if (b == 0) { x = 1; y = 0; d = a; return; } // base case
extendedEuclid(b, a % b); // similar as the original gcd
int x1 = y;
int y1 = x - (a / b) * y;
x = x1;
y = y1;
}
int main(){
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    extendedEuclid(a,b);
    if(c%d!=0)
    printf("Not possible\n");
    else
    printSolutions(a,b);

}
