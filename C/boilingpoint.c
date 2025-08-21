#include <stdio.h>
int main() {
    int b;
    printf("Enter the boiling point of water in degrees Celsius: ");
    scanf("%d", &b);
    switch(b){
        case 100:
            printf("Water boils at 100 degrees Celsius.");
            break;
        case 357:
            printf("mercury boils at 357 degrees Celsius.");
            break;
        case 1187:
            printf("copper boils at 1187 degrees Celsius.");
            break;
        case 2193:
            printf("silver boils at 2193 degrees Celsius.");
            break;
        case 2660:
            printf("gold boils at 2660 degrees Celsius.");
            break;
        default:
            printf("switch unknown %d", b);
    }
    return 0;
}