#Iterative/Recursive Program on Sum of Natural Numbers

import time
import matplotlib.pyplot as plt

def sumn(x):
    sum=0
    for i in range(x):
        sum=sum+i
    print("Sum is ", sum)

def sumr(x):
    if(x==1):
        return x
    else:
        return x+sumr(x-1)

lx=[]
ly=[]
ly1=[]
n=int(input("Enter the size of the input"))
for i in range(n):
    a=int(input("Enter the Input"))
    lx.append(a)
    st=time.time_ns()
    sumn(a)
    ed=time.time_ns()
    ly.append(ed-st)
    st1=time.time_ns()
    sumr(a)
    ed1=time.time_ns()
    ly1.append(ed1-st1)

print("X Axis", lx)
print("Y Axis=I", ly)
print("Y Axis-R", ly1)
plt.plot(lx, ly, label = "Iterative Sum", color="red")
plt.plot(lx, ly1, label = "Recursive Sum", color="blue")
plt.legend()
plt.show()