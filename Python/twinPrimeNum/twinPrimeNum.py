import math
import time

start = time.clock()

def prime(n):
    count = 0

    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
            count=1
        i+=1

    if count==1:
        return None

    else:
        return True


a = []

print "please input the range: "
num = input()

for j in range(2,num):
    if prime(j)==True:
        a.append(j)
        
count = 0



fout = open("test.txt","w")

print >>fout,"the range of search:",num
print >>fout,"the last number is the sum of the twin-primer"

for k in range(len(a)-1):
    if a[k]+2==a[k+1]:
        
        print >>fout,a[k],a[k+1]
        print a[k],a[k+1]
        count+=1

print >>fout,count
        
fout.close

print "the sum of the twin-primer is :"
print count


end = time.clock()
print "the running time is: "
print end-start

