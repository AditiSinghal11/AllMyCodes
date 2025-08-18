#include <stdio.h>
int main(){
    int t;
    printf("enetet the temperature");
    scanf("%d",&t);
    if (t<=0)
    { printf("its very cold");}
    else if (t<10 && t>0 )
    {printf("its cold.");}
    else if (t>10 && t<=20){
        printf("its cool out ");
    }
    else if (t>20 && t<=30){
        printf("its warm");}
    else if (t>30){
        printf("its hot");
    }
return (0);



}