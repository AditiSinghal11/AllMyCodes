//to use isalpha fucntion to check if the input from the array is an alphabet
#include <stdio.h>
#include <ctype.h>
int main(){
char a[100];
int i;
printf("Enter a string: ");
gets(a);
for(i=0;a[i]!='\0';i++){
if(isalpha(a[i])){
printf("%c is an alphabet.\n", a[i]);
}
else{
printf("%c is not an alphabet.\n", a[i]);
}
}
return 0;
}