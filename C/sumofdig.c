#include <stdio.h>
int sum=0;
int x;
int temp;
int main(){
printf("enter the number ");
scanf("%d",&x);
if (x>0){
while (x>0){
 temp=x%10;
 sum=sum+temp;
 x=x/10;

}
printf("the sum of the digits is %d",sum);

}else {printf("the sum fo the digits is negative");}}