//create a structure named student that has name, roll no, mark in 5subjetcs as members.write a program using a structure to read and sisplay the data entered by the user dont make functions as static

#include <stdio.h>
#include <string.h>
struct student {
    char name[50];
    int roll_no;
    int marks[5];
};
int main() {
    struct student s;
    int i;
    printf("Enter name: ");
   scanf("%s", s.name);
    printf("Enter roll number: ");
    scanf("%d", &s.roll_no);
    printf("Enter marks in 5 subjects:\n");
    for(i = 0; i < 5; i++) {
        printf("Subject %d: ", i + 1);
        scanf("%d", &s.marks[i]);
    }
    printf("\nStudent Details:\n");
    printf("Name: %s\n", s.name);
    printf("Roll Number: %d\n", s.roll_no);
    printf("Marks in 5 subjects:\n");
    for(i = 0; i < 5; i++) {
        printf("Subject %d: %d\n", i + 1, s.marks[i]);
    }
    return 0;
    
}