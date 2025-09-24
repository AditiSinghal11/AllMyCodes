#include <stdio.h>
int result1;
//write a c program that reads an integer n uses void to square(int input,int *result) to compute n*n by writing through result, then print it
void square(int input, int *result) {
    *result = input * input;
}
int* square1(int input) {
    result1 = input * input;
    return &result1;
}
int main() {
    int n, result;
    printf("Enter an integer: ");
    scanf("%d", &n);
    square(n, &result);
    printf("The square of %d is %d\n", n, result);
    int* square_result = square1(n);
    printf("The square of %d is %d\n", n, *square_result);  
    return 0;
}
