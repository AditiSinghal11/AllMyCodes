#include <stdio.h>
classifyEvenOrOdd(int number){
    if (number % 2 == 0) {
        printf("%d is even\n", number);
    } else {
        printf("%d is odd\n", number);
    }
}
int main(){
    int number = 7;
    classifyEvenOrOdd();
    return 0;   
}