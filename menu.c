#include <stdio.h>
char x;
int main(){
    printf("enter your choice from the menu:\nA.add part to catalog\nR.remove part from catalog\nF.find part in catalog\nQ.quit\n");
    scanf(" %c", &x);
 do{   switch(x){
        case 'A':
            printf("Adding part to catalog...\n");
            break;
        case 'R':
            printf("Removing part from catalog...\n");
            break;
        case 'F':
            printf("Finding part in catalog...\n");
            break;
        default:
            printf("Invalid choice.\n");
    }}
    while (x != 'Q');
    printf("Quitting the program.\n");
}