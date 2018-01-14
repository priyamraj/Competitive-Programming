n, k, l, c, d, p, nl, np=map(int,input().split())
soda=(k*l)//(n*nl)
limes=c*d//n
salt=p//(np*n)
print(min(soda,limes,salt))