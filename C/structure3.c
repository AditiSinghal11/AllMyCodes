//nested structure
#include <stdio.h>
#include <string.h>
typedef struct {
    int rollno;
    char name[50];
    float gpa;
struct{
    int day, month, year;
} Date;
} Student;
void display(Student s){
    printf("Roll Number: %d\n", s.rollno);
    printf("Name: %s\n", s.name);
    printf("GPA: %.2f\n", s.gpa);
    printf("Date: %02d/%02d/%04d\n", s.Date.day, s.Date.month, s.Date.year);
}
int main() {
    Student s={101,"John",3.5,{15,8,2023}};
    display(s);
    return 0;}
