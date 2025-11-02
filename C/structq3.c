#include <stdio.h>
#include <stdlib.h>

struct Patient {
    int id;
    char name[50];
    int age;
    char diagnosis[50];
};

int main() {
    int capacity = 2, count = 0;
    char choice;

    struct Patient *p = (struct Patient *)malloc(capacity * sizeof(struct Patient));

    do {
        if (count == capacity) {
            capacity *= 2;
            p = (struct Patient *)realloc(p, capacity * sizeof(struct Patient));
            printf("\nArray resized to %d patients\n", capacity);
        }

        printf("Patient %d: ID Name Age Diagnosis: ", count + 1);
        scanf("%d %s %d %s", &p[count].id, p[count].name, &p[count].age, p[count].diagnosis);
        count++;

        printf("Continue? (y/n): ");
        scanf(" %c", &choice);
    } while (choice == 'y' || choice == 'Y');

    printf("\nHospital Patient Records:\n");
    for (int i = 0; i < count; i++) {
        printf("ID: %d, Name: %s, Age: %d, Diagnosis: %s\n",
               p[i].id, p[i].name, p[i].age, p[i].diagnosis);
    }

    printf("Total patients: %d, Array capacity: %d\n", count, capacity);

    free(p);
    return 0;
}
