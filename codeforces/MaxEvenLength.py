s=input()
lis=s.split(' ')
ans=''
mx=0
for i in lis:
    if len(i)%2==0 and len(i)>len(ans):
        ans=i
        mx+=1

if mx==0:
    print('00')
else:
    print(ans)