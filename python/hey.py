price_list=[20,30,40,50]
fruit_list=["apples","mangoes","oranges","bananas"]
print(price_list)
print(fruit_list)
a=int(input("what day?"))
total_bill=0
if a==0:
    T1=int(input("weight of the apples"))
    T2=int(input("weight of the mangoes"))
    T3=int(input("weight of the oranges"))
    T4=int(input("weight of the bananas"))
    while T1<=30 and T2<=30 and T3<=30 and T4<=30:
        total_bill=(price_list[0])*T1+(price_list[1])*T2+(price_list[2])*T3+(price_list[3])*T4
    else:
        print("one of the items exceeds the stock limit of 30kg")
if a==1 or a==2 or a==3 or a==4 or a==5:
    b=a*10/100
    T1=int(input("weight of the apples"))
    T2=int(input("weight of the mangoes"))
    T3=int(input("weight of the oranges"))
    T4=int(input("weight of the bananas"))
    while T1<=30 and T2<=30 and T3<=30 and T4<=30:
        total_bill=(price_list[0]-b)*T1+b*(price_list[1]-b)*T2+b*(price_list[2]-b)*T3+b*(price_list[3]-b)*T4
    else:
        print("one of the items exceeds the stock limit of 30kg")
print(f"the total bill is{total_bill}")

    