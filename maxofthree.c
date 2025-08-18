#include <stdio.h>

int max_of_three(int a, int b, int c){
    if (a>=b && a>=c)
        return a;
    else if (b>=a && b>=c)
        return b;
    else
        return c;
}

int main() {
    int a = 5, b = 10, c = 3;
    int max = max_of_three(a, b, c);
    printf("The maximum of %d, %d, and %d is %d\n", a, b, c, max);
    return 0;
}

