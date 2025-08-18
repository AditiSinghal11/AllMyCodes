#include <math.h>
#include <stdio.h>
int gcd(int a,int b){
//return greatest common divisor of a and b using euclidean algorithm
    while(b!=0){
        int t=b;
        b=a%b;
        a=t;
    }
    return a;
}
int main(){
    int a, b;
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);
    printf("The GCD of %d and %d is %d\n", a, b, gcd(a, b));
    return 0;
    
}