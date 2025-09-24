#include <stdio.h>
//array with return 
int* modify(int *a,int n){
    for(int i=0;i<n;i++){
        a[i]=a[i]+1;
    }
    return a;
}
int *swap(int *x,int *y){
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
    return x;
}
int main(){
    int a[5]={1,2,3,4,5};
    int *p=modify(a,5);
    for(int i=0;i<5;i++){
        printf("%d ",p[i]);
    }
    return 0;
}