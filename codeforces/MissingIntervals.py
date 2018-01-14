answer=[]

def findGap(lis,st):
    start,end=lis[0],lis[1]
    if st<start:
        answer.append([st,start])
        return end
    elif st==start:
        return end
    elif st>start and st<end:
        return end

rng=list(map(int,input().split()))
n=int(input())
intervals=[]
for i in range(n):
    temp=list(map(int,input().split()))
    intervals.append(temp)
intervals.sort()
slots=[]
for i in range(len(intervals)-1):
    if intervals[i][0]==intervals[i+1][0]:
        continue
    else:
        slots.append(intervals[i])
slots.append(intervals[len(intervals)-1])
initial=0
for i in range(len(slots)):
    next=findGap(slots[i],initial)
    initial=next
if(slots[len(slots)-1][1] != rng[1]):
    answer.append([slots[len(slots)-1][1],rng[1]])
print(answer)
