#include<stdio.h>
#include<math.h>
int main(){
   int x;
   int n;
   double sum=1;
printf("enter the value of x and n");
scanf("%d %d",&x,&n);
for (int i=0;i<=n;i++){
    sum+=pow(x,i)/factorial(i);
    }

}





