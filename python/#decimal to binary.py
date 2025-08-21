#decimal to binary
def dec(n):
    if n==0: 
        return ""
    return dec(n//2)+str(n%2)
print(dec(6))