a,b,r=list(map(int,input().split()))
c=0
lis=[]
for i in range(r):
    lis.append(list(map(int,input().split())))
    
lis.sort()
for i in range(len(lis)):
    j=i
    while j+1<len(lis) and lis[j][0]==lis[j+1][0]:
        lis[i][1]=min(lis[j][1],lis[j+1][1])
        lis[i][2]=max(lis[j][2],lis[j+1][2])
        j+=1
temp=[]
#print(lis)
for i in lis:
    if i[0] not in temp:
        c+=b-(i[2]-i[1]+1)
        temp.append(i[0])

print(c+(a-len(temp))*b)