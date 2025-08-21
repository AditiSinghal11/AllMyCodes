#include <stdio.h>
int arr[7];
int main (void) {
// This program reads 7 integers from the user and stores them in an array
// It uses a loop to read the integers and store them in the array
printf("Enter 7 integers:\n");
// Loop to read 7 integers from the user
for (int i = 0; i < 7; i++) {
    scanf("%d", &arr[i]);
}
printf("the array is %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
return 0;
}


