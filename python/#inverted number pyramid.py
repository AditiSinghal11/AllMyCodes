#inverted number pyramid
n=5
i=0
while i<n:
    print(' '*i,end='')
    j=1
    while j<=n-i:
        print(j,end=' ')    
        j+=1
    print()
    i+=1