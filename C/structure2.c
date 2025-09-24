//create a structure student with members:roll no(int), name(string), and gpa(float). write a function display(int roll no,const char*name,float gpa)that takes these members and prints them
#include <stdio.h>
#include <string.h>
typedef struct {
    int roll_no;
    char name[50];
    float gpa;
} student;
void display(student s) {
    printf("Roll Number: %d\n", s.roll_no);
    printf("Name: %s\n", s.name);
    printf("GPA: %.2f\n", s.gpa);
}
int main() {
    student s;
    printf("Enter roll number: ");
    scanf("%d", &s.roll_no);
    printf("Enter name: ");
    scanf("%s", s.name);
    printf("Enter GPA: ");
    scanf("%f", &s.gpa);
    display(s.roll_no, s.name, s.gpa);
    return 0;
}