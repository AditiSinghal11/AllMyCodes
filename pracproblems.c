#include <stdio.h>
#include <math.h>
double sum;
int main(){
    int arr[]={1,2,3,4,5};
    int len = (int)sizeof(arr) /(int) sizeof(arr[0]);
    for (int i=0;i<len;i++){
        sum+=arr[i];
    }

double  mean=sum/len;
    printf("the mean of the elements is %lf",mean);

}